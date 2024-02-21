package com.quarkususerapi.repository;

import com.quarkususerapi.entity.UserEntity;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.decorator.Decorator;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Qualifier;
import jakarta.inject.Singleton;

@ApplicationScoped
public class UserRepository implements PanacheRepository<UserEntity> {

}
