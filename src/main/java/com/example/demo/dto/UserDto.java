package com.example.demo.dto;

import lombok.Getter;
import lombok.Setter;
import org.springframework.lang.NonNull;

import javax.validation.constraints.Null;

@Getter
@Setter
public class UserDto {
    @Null
    private String id;
    @NonNull
    private String username;
    @NonNull
    private String password;
}
