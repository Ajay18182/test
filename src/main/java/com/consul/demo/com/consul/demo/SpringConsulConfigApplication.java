package com.consul.demo.com.consul.demo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringConsulConfigApplication {

	
	@Autowired ApplicationConfiguration config;

	
	
	public static void main(String[] args) {
		SpringApplication.run(SpringConsulConfigApplication.class, args);
	}

	@GetMapping("/get")
	public String getServerDetails() {
		
		
		return config.toString();
	}
	
	
}
