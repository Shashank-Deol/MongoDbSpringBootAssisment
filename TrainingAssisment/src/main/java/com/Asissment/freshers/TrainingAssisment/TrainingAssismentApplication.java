package com.Asissment.freshers.TrainingAssisment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class TrainingAssismentApplication {

	public static void main(String[] args) {
		ApplicationContext ap=SpringApplication.run(TrainingAssismentApplication.class, args);
		
		System.out.println("Started Project");
	}

}
