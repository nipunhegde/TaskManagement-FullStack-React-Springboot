package com.example.Submissonservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class SubmissonServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SubmissonServiceApplication.class, args);
	}

}
