package com.example.backend.apisrest;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EnableJpaRepositories(basePackages = "com.example.backend.apisrest.repositories.jpa")
public class JpaConfig {

}
