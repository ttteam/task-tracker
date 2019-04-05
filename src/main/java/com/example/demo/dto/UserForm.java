package com.example.demo.dto;

import lombok.Getter;
import lombok.Setter;
import org.springframework.lang.NonNull;

import javax.validation.constraints.Null;

@Getter
@Setter
public class UserForm {
    @Null
    private String id;
    @NonNull
    private String username;
    @NonNull
    private String firstPassword;
    @NonNull
    private String secondPassword;

}
