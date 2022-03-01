package com.example.vet_service;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableFeignClients
public class HomeWorkApplication {

	@Bean
	public ModelMapper modelMapper(){
		return new ModelMapper();
	}

	public static void main(String[] args) {
		SpringApplication.run(HomeWorkApplication.class, args);
	}
}

// TODO: 01.03.2022 Разбить таблицы по папкам в PostgreSQL
// TODO: 01.03.2022 @Jsonignore
// TODO: 01.03.2022 посмотреть nullable=true
// TODO: 01.03.2022 сделать медицинскую карту животного
// TODO: 01.03.2022 fetch
// TODO: 01.03.2022 OneToOne
// TODO: 01.03.2022 @Column @JoinColumn
// TODO: 01.03.2022 phone numbers & addresses

