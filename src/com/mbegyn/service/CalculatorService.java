package com.mbegyn.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/operations")
public class CalculatorService {

    @GET
    @Path("/add/{a}/{b}")
    @Produces(MediaType.TEXT_PLAIN)
    public String add(@PathParam("a") int a, @PathParam("b") int b) {
        return (a + b) + "";
    }

    @GET
    @Path("/subtract/{a}/{b}")
    @Produces(MediaType.TEXT_PLAIN)
    public String subtract(@PathParam("a") int a, @PathParam("b") int b) {
        return (a - b) + "";
    }

    @GET
    @Path("/multiply/{a}/{b}")
    @Produces(MediaType.TEXT_PLAIN)
    public String multiply(@PathParam("a") int a, @PathParam("b") int b) {
        return (a * b) + "";
    }

    @GET
    @Path("/divide/{a}/{b}")
    @Produces(MediaType.TEXT_PLAIN)
    public String divide(@PathParam("a") int a, @PathParam("b") int b) {
        return (a / b) + "";
    }

}
