package com.pragma.powerup.domain.spi;

import com.pragma.powerup.domain.model.Person;
import com.pragma.powerup.domain.model.User;

import java.util.List;

public interface IUserPersistencePort {


    void saveUser(User user);

    List<User> getAllUsers();

    Person getUser(Long userId);

    void updateUser(User user);

    void deleteUser(Long userId);

}
