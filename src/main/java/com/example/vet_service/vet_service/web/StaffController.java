package com.example.vet_service.vet_service.web;

import com.example.vet_service.vet_service.service.AdministratorService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RestController
@RequiredArgsConstructor
@RequestMapping("/staff")
public class StaffController {

    private final AdministratorService administratorService;

    @GetMapping("/hireNewAdministrator")
    public String hireNewAdministrator () {
        return this.administratorService.createOneInstance();
    }

}
