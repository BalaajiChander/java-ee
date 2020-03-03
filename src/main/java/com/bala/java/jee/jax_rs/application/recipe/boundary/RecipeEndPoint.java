package com.bala.java.jee.jax_rs.application.recipe.boundary;

import javax.json.Json;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/recipes")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class RecipeEndPoint {

    /**
     * Auto Generated default Constructor stub
     */
    public RecipeEndPoint() {
    }

    @GET
    @Path("/test")
    public Response test() {
        return Response.ok().entity(Json.createObjectBuilder().add("isWorking", "Yes!! As Expected").build()).build();
    }


}
