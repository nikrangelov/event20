package event20.configurations;


import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import javax.ws.rs.ApplicationPath;

/**
 * Created by nik on 6/3/17.
 */

@Component
@ApplicationPath("/api")
public class JerseyConfig extends ResourceConfig {

    public JerseyConfig() {
        //register(Endpoint.class);
        System.out.println("---------------------- Jersey ---------------------------");
        packages("event20.controllers");
    }

}