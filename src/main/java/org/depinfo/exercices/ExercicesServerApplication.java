package org.depinfo.exercices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jackson.JacksonAutoConfiguration;

@SpringBootApplication(exclude = {JacksonAutoConfiguration.class})
public class ExercicesServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExercicesServerApplication.class, args);
	}

}