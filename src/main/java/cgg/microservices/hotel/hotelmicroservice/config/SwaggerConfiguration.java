package cgg.microservices.hotel.hotelmicroservice.config;

import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;

@Configuration(proxyBeanMethods = false)
@OpenAPIDefinition(info = @Info(title = "Hotel api", description = "A simple Hotel API."))
public class SwaggerConfiguration {
}