package event20.services.interfaces;

import event20.entities.User;

/**
 * Created by nik on 5/31/17.
 */

public interface UserService {

    public User findUserByEmail(String email);

    public void saveUser(User user);

}