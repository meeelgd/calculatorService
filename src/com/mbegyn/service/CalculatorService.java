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
    @Produces(MediaType.APPLICATION_JSON)
    public Operation add(@PathParam("a") int a, @PathParam("b") int b) {
        Operation op = new Operation();
        op.setOperationType("ADD");
        op.setNumber1(a);
        op.setNumber2(b);
        op.setResult(a+b);
        return op;
    }

    @GET
    @Path("/subtract/{a}/{b}")
    @Produces(MediaType.APPLICATION_JSON)
    public Operation subtract(@PathParam("a") int a, @PathParam("b") int b) {
        Operation op = new Operation();
        op.setOperationType("SUBTRACT");
        op.setNumber1(a);
        op.setNumber2(b);
        op.setResult(a-b);
        return op;
    }

    @GET
    @Path("/multiply/{a}/{b}")
    @Produces(MediaType.APPLICATION_JSON)
    public Operation multiply(@PathParam("a") int a, @PathParam("b") int b) {
        Operation op = new Operation();
        op.setOperationType("MULTIPLY");
        op.setNumber1(a);
        op.setNumber2(b);
        op.setResult(a*b);
        return op;
    }

    @GET
    @Path("/divide/{a}/{b}")
    @Produces(MediaType.APPLICATION_JSON)
    public Operation divide(@PathParam("a") int a, @PathParam("b") int b) {
        Operation op = new Operation();
        op.setOperationType("DIVIDE");
        op.setNumber1(a);
        op.setNumber2(b);
        op.setResult(a/b);
        return op;
    }

}
