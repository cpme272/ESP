package com.akaraf.maven;

import java.util.List;

import java.util.Map;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

@Path("/examples/")
@Consumes(value = "application/json")
@Produces(value = "application/json")
public interface RestApiService {
      
    @GET
    @Path("/account_settings")
    AccountSettings getAcctSettings();
    
 }
