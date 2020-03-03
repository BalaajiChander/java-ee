package com.bala.java.jee.jax_rs.application.recipe.boundary;

import com.bala.java.jee.jax_rs.application.recipe.controller.RecipeController;
import com.bala.java.jee.jax_rs.application.recipe.entity.Recipe;

import javax.inject.Inject;
import javax.json.Json;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/recipes")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class RecipeEndPoint {

    @Inject
    RecipeController recipeController;

    /**
     * Auto Generated default Constructor stub
     */
    public RecipeEndPoint() {
    }

    /**
     * @return
     */
    @GET
    @Path("/test")
    public Response test() {
        return Response.ok().entity(Json.createObjectBuilder().add("isWorking", "Yes!! As Expected").build()).build();
    }

    /**
     * @return
     */
    @GET
    public Response getAllRecipes() {
        return Response.ok().entity(Json.createObjectBuilder().add("isWorking", "Yes!! As Expected").build()).build();
    }

    /**
     * @param id
     * @return
     */
    @GET
    @Path("/{id}}")
    public Response getRecipe(@PathParam("id") final String id) {
        return Response.ok().entity(Json.createObjectBuilder().add("isWorking", "Yes!! As Expected").build()).build();
    }

    /**
     * @param recipe
     * @return
     */
    @POST
    public Response createRecipe(Recipe recipe) {
        return Response.ok().entity(Json.createObjectBuilder().add("isWorking", "Yes!! As Expected").build()).build();
    }

    /**
     * @param recipe
     * @return
     */
    @PUT
    public Response updateRecipe(Recipe recipe) {
        return Response.ok().entity(Json.createObjectBuilder().add("isWorking", "Yes!! As Expected").build()).build();
    }

    /**
     * @return
     */
    @PATCH
    public Response patchRecipe() {
        return Response.ok().entity(Json.createObjectBuilder().add("isWorking", "Yes!! As Expected").build()).build();
    }

    /**
     * @param id
     * @return
     */
    @DELETE
    @Path("/{id}}")
    public Response deleteRecipe(@PathParam("id") final String id) {
        return Response.ok().entity(Json.createObjectBuilder().add("isWorking", "Yes!! As Expected").build()).build();
    }


}
