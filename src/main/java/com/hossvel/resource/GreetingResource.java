package com.hossvel.resource;

import com.hossvel.singleton.GreetingSingleton;
import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.QueryParam;
import jakarta.ws.rs.core.MediaType;

@Path("/hello")
public class GreetingResource {

    @Inject
    GreetingSingleton greetingSingleton;

    @GET
    public String greeting(@QueryParam("name") String name) {
        return greetingSingleton.saludar(name);
    }
}
