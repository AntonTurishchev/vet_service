package com.example.vet_service.vet_service.service;

import com.example.vet_service.vet_service.service.interfaces.BaseCrudOperations;
import org.springframework.stereotype.Service;

@Service
public class AnimalsService implements BaseCrudOperations {

    @Override
    public String createOneInstance() {
        return "ok";
    }

    @Override
    public void findByFieldInstance() {

    }

    @Override
    public void findByIdOfInstance() {

    }

    @Override
    public void deleteByIdOfInstance() {

    }
}
