package cinema.service.impl;

import java.util.NoSuchElementException;
import cinema.dao.RoleDao;
import cinema.model.Role;
import cinema.service.RoleService;
import org.springframework.stereotype.Service;

@Service
public class RoleServiceImpl implements RoleService {
    private final RoleDao roleDao;

    public RoleServiceImpl(RoleDao roleDao) {
        this.roleDao = roleDao;
    }

    @Override
    public Role add(Role role) {
        return roleDao.add(role);
    }

    @Override
    public Role getByName(String name) throws NoSuchElementException {
        return roleDao.getByName(Role.RoleName.valueOf(name)).orElseThrow(
                () -> new NoSuchElementException("There is no such role " + name));
    }
}
