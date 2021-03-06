package event20.repositories;

import event20.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by nik on 5/31/17.
 */

@Repository("userRepository")
public interface UserRepository extends JpaRepository<User, Long>{

    /*
    By extending CrudRepository, UserRepository
    inherits several methods for working with Customer persistence,
    including methods for saving, deleting, and finding User entities.
     */
    List<User> findByLastName(String lastName);

    User findByEmail(String email);

    @Query("select max(t.id) from User t")
    Long findMaxId();

}
