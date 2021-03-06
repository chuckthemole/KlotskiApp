package com.cpt.klotski;

import org.springframework.boot.SpringApplication;
import javafx.application.Application;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.boot.builder.SpringApplicationBuilder;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;

@SpringBootApplication
@RestController
public class KlotskiApplication extends SpringBootServletInitializer {
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(KlotskiApplication.class);
	}

	@Override
	public void onStartup(ServletContext servletContext) throws ServletException {
		super.onStartup(servletContext);
	}

	public static void main(String[] args) {
		// This is how normal Spring Boot app would be launched
		// SpringApplication.run(SpringBootExampleApplication.class, args);
		SpringApplication.run(KlotskiApplication.class, args);
		Application.launch(Klotski.class, args);
	}
	@RequestMapping(value = "/")
	public String hello() {
		return "Hello World";
	}
}
