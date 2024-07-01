package com.example.backend.apisrest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.example.backend.apisrest.repositories.jpa")
public class ApisrestApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApisrestApplication.class, args);
	}

}
