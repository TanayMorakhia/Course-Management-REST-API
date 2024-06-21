package com.project.datajpa;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.project.datajpa.models.Author;
import com.project.datajpa.repositories.AuthorRepository;

@SpringBootApplication
public class DatajpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(DatajpaApplication.class, args);
	}

	//@Bean
	public CommandLineRunner commandLineRunner(AuthorRepository repository){
		return args -> {
			var author = Author.builder()
				.firstName("Tanay")
				.lastName("Morakhia")
				.email("tanx793@gmail.com")
				.age(5)
				.build();

			repository.save(author);
		};
	}
}
