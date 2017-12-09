package com.jvmworkshop.contactwebapp;

import com.jvmworkshop.contactwebapp.entity.Contact;
import com.jvmworkshop.contactwebapp.repository.ContactRepo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ContactWebAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(ContactWebAppApplication.class, args);
	}

	@Bean
	CommandLineRunner initialize(ContactRepo repo){
	    return (args) ->{
	      repo.save(new Contact("Uzumaki Naruto", "081321411661", "uzumaki_naruto@konohagakure.com", "Konoha"));
	      repo.save(new Contact("Uchiha Sasuke", "081321411662", "uchiha_sasuke@konohagakure.com", "Konoha"));
	      repo.save(new Contact("Sakura Haruno", "081321411663", "sakura_haruno@konohagakure.com", "Konoha"));
	      repo.save(new Contact("Hatake Kakashi", "081321411664", "hatake_kakashi@konohagakure.com", "Konoha"));
	      repo.save(new Contact("Namikaze Minato", "081321411665", "namikaze_minato@konohagakure.com", "Konoha"));
	      repo.save(new Contact("Sabaku No Gaara", "081321411666", "gaara_imut@konohagakure.com", "Suna"));
	      repo.save(new Contact("Kankuro", "081321411667", "kankuro@konohagakure.com", "Suna"));
	      repo.save(new Contact("Temari", "081321411668", "temari@konohagakure.com", "Suna"));
        };
    }
}
