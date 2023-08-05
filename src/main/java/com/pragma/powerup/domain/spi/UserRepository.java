package com.pragma.powerup.domain.spi;

import com.pragma.powerup.domain.model.User;

public interface UserRepository {
    void saveUser(User requestUser);
    User getUserById(Long userId);
    void updateUser(User user);
    void deleteUserById(Long userId);
}
