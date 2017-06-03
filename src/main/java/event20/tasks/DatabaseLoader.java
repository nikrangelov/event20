package event20.tasks;

import event20.entities.Event;
import event20.repositories.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * Created by nik on 6/3/17.
 */

@Component
public class DatabaseLoader implements CommandLineRunner {

    private final EventRepository eventRepository;

    @Autowired
    public DatabaseLoader(EventRepository eventRepository) {
        this.eventRepository = eventRepository;
    }

    @Override
    public void run(String... strings) throws Exception {
        this.eventRepository.save(new Event("Concert", "Sofia"));
    }
}
