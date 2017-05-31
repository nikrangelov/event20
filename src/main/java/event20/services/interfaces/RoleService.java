package event20.services.interfaces;

import event20.entities.Role;
import org.springframework.stereotype.Component;

/**
 * Created by nik on 5/31/17.
 */

@Component
public interface RoleService {

    public Role findByRole(String role);

    void save(Role role);

}