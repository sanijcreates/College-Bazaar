package com.collegebaazar.College.Bazaar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class CollegeBazaarApplication {
	//SpringApplication contains the run method. To run our appllication we will have to use the run method.
	public static void main(String[] args) {
		SpringApplication.run(CollegeBazaarApplication.class, args);
	}

	//the getMapping lets the framework know that apiRoute is a get endpoint
	@GetMapping("/api")
	public String apiRoute() {
		return "Hello,world!";
	}
}
