package com.slokam.da.hc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;

@SpringBootApplication
@OpenAPIDefinition(info=@Info(title="Health Care",
version="1.0",
description ="Provide All Helth Care Related API"))
public class HelthcareApplication {
	public static void main(String[] args) {
		SpringApplication.run(HelthcareApplication.class, args);
		
	
	}
}

