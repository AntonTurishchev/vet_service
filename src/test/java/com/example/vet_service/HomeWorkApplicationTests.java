package com.example.vet_service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import static org.assertj.core.api.Assertions.assertThat;


@SpringBootTest
@AutoConfigureMockMvc
class HomeWorkApplicationTests {

	@Autowired
	private HomeWorkApplication application;

	@Test
	void contextLoads() throws Exception {
		assertThat(application).isNotNull();

	}

}
