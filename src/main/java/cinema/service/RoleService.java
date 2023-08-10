package cinema.service;

import cinema.model.Role;

public interface RoleService {
    Role add(Role adminRole);

    Role getByName(String name);
}
