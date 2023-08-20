package com.example.dictionary_api.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;

@Configuration
public class OpenAPIConfig {
     
    @Bean 
    public OpenAPI OpenAPI(){ 
        return new OpenAPI() 
        .info(new Info() 
        .title("My PAF workshop 1 API on swagger") 
        .description("PAF Day 21") 
        .version("version 1.0")); 
    } 
}
