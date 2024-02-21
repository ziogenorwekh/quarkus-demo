package com.quarkususerapi.dto;

import jakarta.persistence.Column;
import lombok.Getter;

import java.io.Serializable;


@Getter
public class UserDTO implements Serializable {

    private Long id;

    private String email;

    private String username;

    public UserDTO(Long id, String email, String username) {
        this.id = id;
        this.email = email;
        this.username = username;
    }
}
