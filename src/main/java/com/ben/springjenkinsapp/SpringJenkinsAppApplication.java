package com.ben.springjenkinsapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringJenkinsAppApplication {

	@GetMapping
	public String message(){ return "hello Mohamed Bendahui..."; }

	public static void main(String[] args) {
		SpringApplication.run(SpringJenkinsAppApplication.class, args);
	}

}
