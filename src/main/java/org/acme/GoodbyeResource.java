package org.acme;


import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/bye")
public class GoodbyeResource {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        String peter = "Peter";
        return "Goodbye from RESTEasy Reactive";
    }
}
