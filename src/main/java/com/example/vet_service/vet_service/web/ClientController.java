package com.example.vet_service.vet_service.web;

import com.example.vet_service.vet_service.dto.request.persons.PersonRequest;
import com.example.vet_service.vet_service.service.PersonService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.persistence.EntityExistsException;

@Controller
@RestController
@RequiredArgsConstructor
@RequestMapping("/client")
public class ClientController {

    private final PersonService personService;

    @PostMapping("/addNewClient")
    public String addNewClient (@RequestBody PersonRequest personRequest) {
        try {
            return this.personService.addNewClient(personRequest);
        } catch (EntityExistsException exception) {
            return exception.getMessage();
        }
    }

    @GetMapping("/getClientByName")
    public String getClientByName (@RequestParam String name) {
        try {
            return this.personService.getClientByName(name);
        } catch (EntityExistsException exception) {
            return exception.getMessage();
        }
    }

    @GetMapping ("/getAllClients")
    public String getAllClients () {
        try {
            return this.personService.getAllClients();
        } catch (EntityExistsException exception) {
            return exception.getMessage();
        }
    }

    @DeleteMapping ("/deleteClient")
    public String deleteClient () {
        try {
            return this.personService.deleteClient();
        } catch (EntityExistsException exception) {
            return exception.getMessage();
        }
    }
}
