package com.thoughtmechanix.confsvr;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * This class represents the Spring Cloud Config service
 * as a Spring Boot Application.
 *
 * The <b>@EnableConfigServer</b> annotation enables the service
 * as a Spring Cloud Config service.
 *
 * @author Ernesto A. Rodriguez Acosta
 */

@SpringBootApplication
@EnableConfigServer
public class ConfigServerApplication {
    public static void main(String [] args) {
        SpringApplication.run(ConfigServerApplication.class, args);
    }
}
