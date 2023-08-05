package com.pragma.powerup.domain.usecase;

import com.pragma.powerup.domain.api.IRoleServicePort;
import com.pragma.powerup.domain.model.Role;
import com.pragma.powerup.domain.spi.IRolePersistencePort;

import java.util.List;

public class RoleUseCase implements IRoleServicePort {


    private final IRolePersistencePort rolePersistencePort;

    public RoleUseCase(IRolePersistencePort rolePersistencePort) {
        this.rolePersistencePort = rolePersistencePort;
    }

    @Override
    public void saveRole(Role role) {
        rolePersistencePort.saveRole(role);
    }

    @Override
    public List<Role> getAllRoles() {
        return rolePersistencePort.getAllRoles();
    }

    @Override
    public Role getRole(Long roleId) {
        return rolePersistencePort.getRole(roleId);
    }

    @Override
    public void updateRole(Role role) {
        rolePersistencePort.updateRole(role);
    }

    @Override
    public void deleRole(Long roleId) {
        rolePersistencePort.deleRole(roleId);
    }
}
