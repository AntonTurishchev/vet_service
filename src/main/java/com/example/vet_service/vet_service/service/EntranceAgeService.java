package com.example.vet_service.vet_service.service;

import org.springframework.beans.factory.annotation.Value;

public class EntranceAgeService {

    @Value("${ownerAge}")
    private String age;

    public void ageSettings() {
        System.out.println("Current age determine by YML file is " + age);
    }
}
