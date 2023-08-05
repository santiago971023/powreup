package com.pragma.powerup.domain.service;

import com.pragma.powerup.domain.model.Person;
import com.pragma.powerup.domain.model.User;
import com.pragma.powerup.domain.spi.UserRepository;

import java.util.List;

public class UserServiceImpl implements UserService{

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


    @Override
    public void createUser(User requestUser, User requestingUser) {
        // validar que el usuario que realiza la acción tiene el rol de "Admin"
        if(!hasCreateUserPermission(requestingUser)){
            throw new RuntimeException("No tienes permiso para crear usuarios.");
        }
        if((requestingUser.getRole().getName().equalsIgnoreCase("Admin") && requestUser.getRole().getName().equalsIgnoreCase("Owner"))||
                requestingUser.getRole().getName().equalsIgnoreCase("Owner") && requestUser.getRole().getName().equalsIgnoreCase("Employee")){
            userRepository.saveUser(requestUser);
        }else{
            throw new RuntimeException("No tienes el rol adecuado para crear este usuario");
        }

    }

    private boolean hasCreateUserPermission(User user) {
        // Lógica para verificar el rol del usuario y retornar true si tiene permiso
        return user.getRole().getName().equalsIgnoreCase("Admin") || user.getRole().getName().equalsIgnoreCase("Owner");
    }

    @Override
    public List<User> getAllUsers() {
        return null;
    }

    @Override
    public Person getUser(Long userId) {
        return null;
    }

    @Override
    public void updateUser(User user) {

    }

    @Override
    public void deleteUser(Long userId) {

    }
}
