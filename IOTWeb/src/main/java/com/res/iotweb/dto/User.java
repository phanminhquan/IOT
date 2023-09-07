package com.res.iotweb.dto;

import jakarta.persistence.Column;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class User {
    private Long id;

    private String name;

    private String username;

    private String password;
}
