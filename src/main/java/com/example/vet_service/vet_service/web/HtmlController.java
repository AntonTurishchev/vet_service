package com.example.vet_service.vet_service.web;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Slf4j
@Controller
public class HtmlController {

    @GetMapping( "/hello/{name}")
    public String hello(Model model, @PathVariable String name) {
        log.debug(name);
        model.addAttribute("name", name);
        return "hello";
    }

    @PostMapping("/translate")
    public String translate(@RequestParam String textForm, Model model) {
        model.addAttribute("textForm", textForm);
        return "success";
    }

    @GetMapping( "/allDogs")
    public String allDogs() {
        return "allDogs";
    }

    @GetMapping ("/home")
    public String home() {
        return "homePage";
    }

    @GetMapping( "/allCats")
    public String allCats() {
        return "allCats";
    }

    @GetMapping ("/dogOwners")
    public String dogOwners() {
        return "allDogOwners";
    }

    @GetMapping( "/catOwners")
    public String catOwners() {
        return "allCatOwners";
    }



}
