package com.example.quizAppMicroservices_quiz_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class QuizAppMicroservicesQuizServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(QuizAppMicroservicesQuizServiceApplication.class, args);
	}

}
