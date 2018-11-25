package com.infodashboard.associate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing

public class AssociateApplication {

	public static void main(String[] args) {

		SpringApplication.run(AssociateApplication.class, args);
	}
	

}
