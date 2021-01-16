package com.cpt.klotski;

//import org.springframework.boot.SpringApplication;
import javafx.application.Application;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class KlotskiApplication {
	public static void main(String[] args) {
		// This is how normal Spring Boot app would be launched
		// SpringApplication.run(SpringBootExampleApplication.class, args);

		Application.launch(Klotski.class, args);
	}
	@RequestMapping(value = "/")
	public String hello() {
		return "Hello World";
	}
}
