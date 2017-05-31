package event20.repositories;

import event20.entities.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by nik on 5/31/17.
 */

@Repository("roleRepository")
public interface RoleRepository extends JpaRepository<Role, Long> {

    Role findByRole(String role);

}