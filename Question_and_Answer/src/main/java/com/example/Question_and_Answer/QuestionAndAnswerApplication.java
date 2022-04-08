package com.example.Question_and_Answer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing

public class QuestionAndAnswerApplication {

	public static void main(String[] args) {
		SpringApplication.run(QuestionAndAnswerApplication.class, args);
	}

}
