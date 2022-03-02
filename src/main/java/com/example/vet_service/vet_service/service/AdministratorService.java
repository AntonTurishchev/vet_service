package com.example.vet_service.vet_service.service;

import com.example.vet_service.vet_service.service.interfaces.BaseCrudOperations;
import com.example.vet_service.vet_service.service.interfaces.AssignmentModification;

public class AdministratorService implements BaseCrudOperations, AssignmentModification {
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

    @Override
    public void takeNewAssignment() {

    }

    @Override
    public void correctNewAssignment() {

    }
}
