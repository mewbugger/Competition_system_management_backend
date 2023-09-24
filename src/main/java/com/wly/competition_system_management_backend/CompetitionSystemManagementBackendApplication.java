package com.wly.competition_system_management_backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import springfox.documentation.swagger2.annotations.EnableSwagger2WebMvc;

@SpringBootApplication
@EnableScheduling
@EnableSwagger2WebMvc
public class CompetitionSystemManagementBackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(CompetitionSystemManagementBackendApplication.class, args);
    }

}
