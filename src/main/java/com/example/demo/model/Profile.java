package com.example.demo.model;

import com.sun.xml.internal.bind.v2.TODO;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.sql.Date;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Entity
@Table(name = "profile", schema = "new_schema")
@Getter
@Setter
public class Profile {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstName;
    private String secondName;
    private String email;
    private Date birthday;

    @OneToOne (cascade = {
            CascadeType.PERSIST,
            CascadeType.MERGE
    })
    @JoinColumn(name = "userid", referencedColumnName = "id")
    private User user;

    //TODO: посмотреть связь с какой таблицей
    @ManyToMany(cascade = {
            CascadeType.PERSIST,
            CascadeType.MERGE
    })
    @JoinTable(name = "issuerole_profile_issue",
            joinColumns = @JoinColumn(name = "profileid"),
            inverseJoinColumns = @JoinColumn(name = "issueid")
    )
    private Set<IssueRole> roles = new HashSet<>();

    @ManyToMany(cascade = {
            CascadeType.PERSIST,
            CascadeType.MERGE
    })
    @JoinTable(name = "profile_filter",
            joinColumns = @JoinColumn(name = "profileid"),
            inverseJoinColumns = @JoinColumn(name = "filterid")
    )
    private Set<Filter> filters = new HashSet<>();

    public Profile() {
    }

    public Profile(String firstName, String secondName, String email, Date birthday, User user) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.email = email;
        this.birthday = birthday;
        this.user = user;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Profile profile = (Profile) object;
        return Objects.equals(id, profile.id) &&
                Objects.equals(firstName, profile.firstName) &&
                Objects.equals(secondName, profile.secondName) &&
                Objects.equals(email, profile.email) &&
                Objects.equals(birthday, profile.birthday) &&
                Objects.equals(user, profile.user);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, firstName, secondName, email, birthday, user);
    }
}
