package com.example.demo.dto;

import com.example.demo.model.Profile;
import lombok.Getter;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Null;
import java.sql.Date;

@Getter
@Setter
public class CommentDto {
    @Null
    private String id;

    @NotNull
    private String commentText;

    @NotNull
    @DateTimeFormat
    private Date time;

    @NotNull
    private Profile profile;

}
