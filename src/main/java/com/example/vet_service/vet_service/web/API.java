package com.example.vet_service.vet_service.web;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

//@FeignClient(name = "test", url = "https://ethgasstation.info")
@FeignClient(name = "test", url = "https://api.fastforex.io")
public interface API {

    @RequestMapping(method = RequestMethod.GET, value = "/fetch-one?from=USD&to=RUB&api_key=7f9b57316b-a1546171ff-r7052v")
    String usdRub() ;

    // TODO: 10.02.2022 Поместить токен api_key=7f9b57316b-a1546171ff-r7052v в строку и выдавать 49:40
}
