package com.example.demo.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Entity
@Table(name = "user", schema = "new_schema")
//@Table(name = "user")
@Getter
@Setter
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
//    private String username;
    private String username;
    private String password;


    @ManyToMany(cascade = {
            CascadeType.PERSIST,
            CascadeType.MERGE,

    })
    @JoinTable(name = "user_role",
            joinColumns = @JoinColumn(name = "userid"),
            inverseJoinColumns = @JoinColumn(name = "roleid")
    )
    private Set<Role> roles = new HashSet<>();

    @OneToOne(mappedBy = "user")
    private Profile profile;

    public User() {
    }

    public User(Long id, String username, String password, Set<Role> roles) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.roles = roles;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", roles=" + roles +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return id.equals(user.id) &&
                username.equals(user.username) &&
                password.equals(user.password) &&
                roles.equals(user.roles);    }

    @Override
    public int hashCode() {
        return Objects.hash(id, username, password, roles);
    }
}
