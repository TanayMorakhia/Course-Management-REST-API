package com.project.datajpa;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.github.javafaker.Faker;
import com.project.datajpa.models.Author;
import com.project.datajpa.repositories.AuthorRepository;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootApplication
public class DatajpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(DatajpaApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(AuthorRepository repository){
		return args -> {

//			for (int i = 0; i < 50; i++) {
//				Faker faker = new Faker();
//				var author = Author.builder()
//					.firstName(faker.name().firstName())
//					.lastName(faker.name().lastName())
//					.email("contact" + i + "@project.com")
//					.age(faker.number().numberBetween(1,50))
//					.build();
//
//				repository.save(author);
//
//			}

			// updates the query if the if already exists and creates a new query if id do not exists
//			var author = Author.builder()
//				.id(1)
//				.firstName("Tanay")
//				.lastName("Morakhia")
//				.email("tanx@gmail.com")
//				.age(23)
//				.build();
//
//			repository.save(author);


//			System.out.println(repository.findById(1));

			repository.updateWhereAgeWhereIdIs(21, 1);

			log.info(repository.findById(1).toString());

		};
	}
}
