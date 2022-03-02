package com.example.vet_service.vet_service.service;

import com.example.vet_service.vet_service.dto.request.persons.PersonRequest;
import org.springframework.stereotype.Service;

@Service
public class PersonService {
    public String addNewClient(PersonRequest personRequest) {
        return "ok";
    }


    public String getClientByName (String name) {
        return "ok";
    }

    public String getAllClients () {
        return "ok";
    }

    public String deleteClient () {
        return "ok";
    }


}