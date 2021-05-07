package com.starters.cardatabase;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.starters.cardatabase.domain.Car;
import com.starters.cardatabase.domain.CarRepository;
import com.starters.cardatabase.domain.Owner;
import com.starters.cardatabase.domain.OwnerRepository;

@SpringBootApplication
public class CardatabaseApplication {

	private static final Logger logger = LoggerFactory.getLogger(CardatabaseApplication.class);
	@Autowired
	private CarRepository repository;
	@Autowired
	private OwnerRepository orepository;
	public static void main(String[] args) {
		SpringApplication.run(CardatabaseApplication.class, args);
		logger.info("Hello Spring 55 Boot");
	}
	
	@Bean
	CommandLineRunner runner() {
		return args -> {
			Owner owner1=new Owner("Raghav", "Singhania");
			Owner owner2=new Owner("John", "Cena");
			orepository.save(owner1);
			orepository.save(owner2);
			repository.save(new Car("Ford", "EcoSport", "Black", "RJ", 2019, 123456,owner1));
			repository.save(new Car("Hyundai", "Verna", "White", "WB", 2018, 56789,owner1));
			repository.save(new Car("Tesla", "ModelT", "Black", "BAN", 2020, 723456,owner2));
			repository.save(new Car("Tata", "nano", "Yellow", "GJ", 2010, 923456,owner2));
		};
	}
}
