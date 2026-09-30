package com.adam.voituremicroservice;

import com.adam.voituremicroservice.entities.Voiture;
import com.adam.voituremicroservice.repos.VoitureRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class VoitureMicroserviceApplication {

    public static void main(String[] args) {
        SpringApplication.run(VoitureMicroserviceApplication.class, args);
    }
    @Bean
    CommandLineRunner commandLineRunner(VoitureRepository voitureRepository) {
        return args -> {
            voitureRepository.save(Voiture.builder()
                    .voitName("Peugeot 208")
                    .voitCode("PG")
                    .build());
            voitureRepository.save(Voiture.builder()
                    .voitName("Renault Clio")
                    .voitCode("RN")
                    .build());
        };
    }
}
