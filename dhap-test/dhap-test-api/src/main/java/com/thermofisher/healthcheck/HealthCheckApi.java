package com.thermofisher.healthcheck;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

/**
 * Created by patelb on 9/29/2016.
 */
@Path("/healthcheck")
public interface HealthCheckApi {
    /**
     * Checks connectivity to application server.
     * void method results in a 204 No Content response in the case of JAX-RS.
     * so to get response as 200 OK the return type should be boolean.
     * For success 200 will be sent to caller.
     */
    @GET
    boolean checkHealth();
}
