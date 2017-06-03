package event20.controllers;

import org.springframework.stereotype.Component;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

/**
 * Created by nik on 6/3/17.
 */

@Component
@Path("/hello")
public class Endpoint {

    @Path("/msg")
    @GET
    public String message() {
        return "Hello ";
    }

}