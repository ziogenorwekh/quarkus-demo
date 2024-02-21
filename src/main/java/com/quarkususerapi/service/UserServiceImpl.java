package com.quarkususerapi.service;

import com.quarkususerapi.dto.UserDTO;
import com.quarkususerapi.entity.UserEntity;
import com.quarkususerapi.repository.UserRepository;
import com.quarkususerapi.vo.UserRequest;
import io.quarkus.hibernate.orm.panache.PanacheQuery;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.inject.Singleton;
import jakarta.transaction.Transactional;
import org.hibernate.service.spi.InjectService;

@ApplicationScoped
public class UserServiceImpl implements UserService {

    private UserRepository userRepository;

    @Inject
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    @Transactional
    public void save(UserRequest userRequest) {

        UserEntity user = new UserEntity(userRequest.getEmail(), userRequest.getUsername(), userRequest.getPassword());
        userRepository.persist(user);
    }

    @Override
    @Transactional
    public UserDTO findUser(Long id) {
        UserEntity userEntity = userRepository.findById(id);
        UserDTO userDTO = new UserDTO(userEntity.getId(), userEntity.getEmail(), userEntity.getUsername());
        return userDTO;
    }

}
