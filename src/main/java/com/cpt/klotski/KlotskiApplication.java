package com.cpt.klotski;

//import org.springframework.boot.SpringApplication;
import javafx.application.Application;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class KlotskiApplication {
	public static void main(String[] args) {
		// This is how normal Spring Boot app would be launched
		// SpringApplication.run(SpringBootExampleApplication.class, args);
		
		Application.launch(Klotski.class, args);
	}
}
