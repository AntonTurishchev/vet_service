package com.example.vet_service.vet_service.conf;

import com.example.vet_service.vet_service.service.EntranceAgeService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AgeConfiguration {

    @Bean
    public EntranceAgeService entranceAge() {
        return new EntranceAgeService();
    }
}
