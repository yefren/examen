package com.example.backend.apisrest;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableReactiveMongoRepositories;

@Configuration
@EnableReactiveMongoRepositories(basePackages = "com.example.backend.apisrest.repositories.mongodb")
public class MongoConfig {
    
}
