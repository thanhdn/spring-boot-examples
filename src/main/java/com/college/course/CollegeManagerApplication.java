package com.college.course;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan( basePackages = {"com.college.to"} )
public class CollegeManagerApplication {

	public static void main(String[] args) {
		SpringApplication.run(CollegeManagerApplication.class, args);
	}
}
