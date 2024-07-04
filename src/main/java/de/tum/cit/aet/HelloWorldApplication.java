package de.tum.cit.aet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class HelloWorldApplication {

	@RequestMapping("/")
	public String home() {
		return "Hello Applied Software Engineering";
	}

	public static void main(String[] args) {
		SpringApplication.run(HelloWorldApplication.class, args);
	}

}
