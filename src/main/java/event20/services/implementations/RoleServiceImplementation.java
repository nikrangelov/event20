package event20.services.implementations;

import event20.entities.Role;
import event20.repositories.RoleRepository;
import event20.services.interfaces.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by nik on 5/31/17.
 */

@Service("roleService")
public class RoleServiceImplementation implements RoleService {

    @Autowired
    RoleRepository roleRepository;

    public Role findByRole(String role){
        return roleRepository.findByRole(role);
    }

    public void save(Role role){
        roleRepository.save(role);
    }
}

