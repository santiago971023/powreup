package com.pragma.powerup.domain.service;

import com.pragma.powerup.domain.model.Person;
import com.pragma.powerup.domain.model.User;
import com.pragma.powerup.domain.spi.UserRepository;

import java.util.List;

public interface UserService {

    void createUser(User requestUser, User requestingUser);

    List<User> getAllUsers();

    Person getUser(Long userId);

    void updateUser(User user);

    void deleteUser(Long userId);


}
