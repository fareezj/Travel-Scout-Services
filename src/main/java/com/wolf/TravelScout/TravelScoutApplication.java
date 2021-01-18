package com.wolf.TravelScout;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.wolf"})
public class TravelScoutApplication {

	public static void main(String[] args) {
		SpringApplication.run(TravelScoutApplication.class, args);
	}

}
