package com.clifav.accounts;

import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
/*
* @ComponentScans({@ComponentScan("com.eazybytes.accounts.controller")})
* @EnableJpaRepositories("com.eazybytes.accounts.repository")
* @EntityScan("com.eazybytes.accounts.model")
* */
@EnableJpaAuditing(auditorAwareRef = "auditImpl")
@OpenAPIDefinition(
		info = @Info(
				title = "Accounts microservice REST API Documentation",
				description = "EasyBank Accounts microservice REST API Documentation",
				version = "1.0",
				contact = @Contact(
						name = "Bappaditya Dutta",
						email = "bappadityadutta2024@gmail.com"
				),
				license = @License(
						name="Apache 2.0",
						url= ""
				)
		),
		externalDocs = @ExternalDocumentation(
				description = "EasyBank Accounts microservice REST API Documentation",
				url = "https://www.eazybytes.com/swagger-ui.html"
		)
)
public class AccountsApplication {

	public static void main(String[] args) {
		SpringApplication.run(AccountsApplication.class, args);
	}

}
