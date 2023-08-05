package com.pragma.powerup.domain.spi;

import com.pragma.powerup.domain.model.Role;

import java.util.List;

public interface IRolePersistencePort {


    void saveRole(Role role);

    List<Role> getAllRoles();

    Role getRole(Long roleId);

    void updateRole(Role role);

    void deleRole(Long roleId);

}
