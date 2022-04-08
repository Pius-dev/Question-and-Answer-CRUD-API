package com.example.Question_and_Answer.repository;



import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Question_and_Answer.model.Question;

public interface QuestionRepository extends JpaRepository<Question , Long>{

	

}
