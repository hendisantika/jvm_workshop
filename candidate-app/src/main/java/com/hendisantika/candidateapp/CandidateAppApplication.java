package com.hendisantika.candidateapp;

import com.hendisantika.candidateapp.entity.Candidate;
import com.hendisantika.candidateapp.repository.CandidateRepo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CandidateAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(CandidateAppApplication.class, args);
	}

	@Bean
	public CommandLineRunner initialize(CandidateRepo repo){
		return (args) -> {
			repo.save(new Candidate("Uzumaki Naruto", "uzumaki_naruto@konohagakure.com", "081321", "Konohagakure"));
			repo.save(new Candidate("Uchiha Sasuke", "uchiha_sasuke@konohagakure.com", "081322", "Konohagakure"))	;
			repo.save(new Candidate("Sakura Haruno", "sakura_haruno@konohagakure.com", "081323", "Konohagakure"))	;
			repo.save(new Candidate("Hatake Kakashi", "hatake_kakashi@konohagakure.com", "081324", "Konohagakure"));
			repo.save(new Candidate("Sarutobi Sandaime", "sarutobi_sandaime@konohagakure.com", "081325", "Konohagakure"));

		};

	}
}
