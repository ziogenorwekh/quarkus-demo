package com.quarkususerapi.vo;

import com.quarkususerapi.dto.UserDTO;
import lombok.Getter;

@Getter
public class UserResponse {

    private final String email;
    private final String username;

    public UserResponse(UserDTO userDTO) {
        this.email = userDTO.getEmail();
        this.username = userDTO.getUsername();
    }
}
