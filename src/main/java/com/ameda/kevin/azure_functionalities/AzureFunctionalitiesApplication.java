package com.ameda.kevin.azure_functionalities;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class AzureFunctionalitiesApplication {

	@GetMapping("/message")
	public ResponseEntity<?> message(){
		return ResponseEntity
				.ok()
				.body("Congrats! your app deployed successfully on Azure");
	}
	public static void main(String[] args) {
		SpringApplication.run(AzureFunctionalitiesApplication.class, args);
	}

}
