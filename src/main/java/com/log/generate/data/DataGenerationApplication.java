package com.log.generate.data;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class DataGenerationApplication {

	public static void main(String[] args) {
		SpringApplication.run(DataGenerationApplication.class, args);

	}


}
