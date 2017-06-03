package event20.entities;

import lombok.Data;

import javax.persistence.*;

/**
 * Created by nik on 6/3/17.
 */

@Entity
@Data // Data anotation generates all getters, setters, etc.
@Table(name = "event")
public class Event {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "user_id")
    private long id;

    @Column(name = "name")
    private String name;

    @Column(name = "location")
    private String location;

    private Event(){
        // private constructor for Spring Data
    }

    public Event(String name, String location) {
        this.name = name;
        this.location = location;
    }
}
