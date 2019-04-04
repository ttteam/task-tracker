package com.example.demo.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "comment", schema = "new_schema")
@Getter
@Setter
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String commentText;
    private Date time;

    @ManyToOne(cascade = {
            CascadeType.ALL
    })
    @JoinColumn(name = "profileId", referencedColumnName = "id")
    private Profile profile;

    public Comment(){  }

    public Comment(String commentText, Date time, Profile profile) {
        this.commentText = commentText;
        this.time = time;
        this.profile = profile;
    }
}
