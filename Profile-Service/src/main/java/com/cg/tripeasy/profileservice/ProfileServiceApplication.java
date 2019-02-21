package com.cg.tripeasy.profileservice;

import java.time.LocalDate;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.cg.tripeasy.profileservice.entity.Address;
import com.cg.tripeasy.profileservice.entity.Profile;
import com.cg.tripeasy.profileservice.repository.ProfileRepository;

@SpringBootApplication

public class ProfileServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProfileServiceApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(ProfileRepository repo) {
		return (args)->{
			repo.save(new Profile("shabzan.jpg","shabzan","shaikshabzan@gmail.com","1234","male",
					  LocalDate.of(1995, 06, 19),"unmarried",new Address("gandhinagar", 67, "AP", 521151),"shabbzan","Shabzan@1"));
			repo.save(new Profile("sai.jpg","sai","sai@gmail.com","234","male",
					  LocalDate.of(1996, 06, 19),"married",new Address("airoli", 7, "UP", 52115),"shabbi","ammananna"));
		
			repo.save(new Profile("shaik.jpg","shaik","shaiksai@gmail.com","34","male",
					  LocalDate.of(1997, 06, 19),"married",new Address("airoli", 7, "MP", 2115),"sai143","shabzan@1234"));
		};
}
}