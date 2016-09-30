package com.themofisher.heathcheck;


import com.thermofisher.healthcheck.HealthCheckApi;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by patelb on 9/29/2016.
 */
public class HealthCheckApiImpl implements HealthCheckApi {
    private static Logger _logger = LoggerFactory.getLogger(HealthCheckApiImpl.class);
    public boolean checkHealth() {
        _logger.info("Dhap-test is up!!!");
        return true;
    }
}
