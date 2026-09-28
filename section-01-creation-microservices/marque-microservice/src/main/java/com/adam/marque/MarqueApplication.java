package com.adam.marque;

import com.adam.marque.entities.Marque;
import com.adam.marque.repos.MarqueRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.reactive.function.client.WebClient;
@EnableFeignClients
@SpringBootApplication
public class MarqueApplication {

	public static void main(String[] args) {
		SpringApplication.run(MarqueApplication.class, args);}
		@Bean
		CommandLineRunner commandLineRunner(MarqueRepository marqueRepository) {
			return args -> {
				marqueRepository.save(Marque.builder()
						.nom("Peugeot")
						.pays("France")
						.voitCode("PG")
						.build());
			};
		}
	@Bean
	public WebClient webClient() {
		return WebClient.builder().build();
	}

	}


