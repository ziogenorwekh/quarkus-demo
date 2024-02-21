package com.quarkususerapi.vo;

import lombok.Getter;

@Getter
public class UserRequest {

    private final String email;
    private final String password;
    private final String username;

    public UserRequest(String email, String password, String username) {
        this.email = email;
        this.password = password;
        this.username = username;
    }
}
