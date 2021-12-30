package web.service;

import web.models.Role;

import java.util.HashSet;
import java.util.List;

public interface RoleService {

    Role getRoleByName(String role);

    List<Role> getAllRoles();

    HashSet<Role> getSetOfRoles(String[] roleNames);

    Role addRole(Role role);
}
