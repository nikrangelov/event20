package event20.tasks;

import event20.entities.Role;
import event20.entities.User;
import event20.services.interfaces.RoleService;
import event20.services.interfaces.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

/**
 * Created by nik on 5/31/17.
 */

@Component
public class RoleAdder implements ApplicationRunner {

    @Autowired
    RoleService roleService;

    @Autowired
    UserService userService;

    private static final Logger log = LoggerFactory.getLogger(RoleAdder.class);

    @Override
    public void run(ApplicationArguments applicationArguments) throws Exception {
        // TODO: Add roles in the database
        // Add user role if does not exist.
        Role role = roleService.findByRole("ROLE_USER");

        if(role == null) {
            Role userRole = new Role("ROLE_USER");
            roleService.save(userRole);
        }

        User user = userService.findUserByEmail("ivan@ivanov.com");

        if(user == null){
            User defaultUser = new User("Ivan", "Ivanov", "ivan@ivanov.com");
            defaultUser.setPassword("1234");
            //userService.saveUser(defaultUser);
            //some problem occurs here
        }
        log.info("Adding roles and user to database");
    }
}
