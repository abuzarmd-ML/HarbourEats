package com.example.harboureats;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@SpringBootApplication
@EntityScan("com.example.harboureats.model.*")
@EnableJpaRepositories("com.example.harboureats.repository.*")
public class HarbourEatsApplication {
	public static void main(String[] args) {
		SpringApplication.run(HarbourEatsApplication.class, args);
	}
}
