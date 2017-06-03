package event20.repositories;

import event20.entities.Event;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by nik on 6/3/17.
 */

@Repository("eventRepository")
public interface EventRepository extends JpaRepository<Event, Long>{

    Event findById(Long id);

}
