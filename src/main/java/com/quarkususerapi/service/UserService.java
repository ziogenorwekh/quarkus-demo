package com.quarkususerapi.service;

import com.quarkususerapi.dto.UserDTO;
import com.quarkususerapi.vo.UserRequest;

public interface UserService {

    void save(UserRequest userRequest);

    UserDTO findUser(Long id);
}
