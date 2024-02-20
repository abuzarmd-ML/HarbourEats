package com.example.harboureats;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan("com.example.harboureats.model.*")
@EnableJpaRepositories("com.example.harboureats.repository")
public class HarbourEatsApplication {
	public static void main(String[] args) {
		SpringApplication.run(HarbourEatsApplication.class, args);
	}
}
