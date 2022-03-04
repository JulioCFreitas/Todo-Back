package com.julio.todo.services;

import java.time.LocalDateTime;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import com.julio.todo.domain.Todo;
import com.julio.todo.repositories.TodoRepository;

@Service
public class DBService {
	
	@Autowired
	private TodoRepository todoRepository;
	
	@Bean
	public void instanciaBaseDados() {
		LocalDateTime localDateTime = LocalDateTime.now();
		Todo t1 = new Todo(null, "Estudar", "fdfdaffsdfsd", localDateTime, false);
		Todo t2 = new Todo(null, "Ler", "frefregegr", localDateTime, false);
		Todo t3 = new Todo(null, "Correr", "frefrefrf", localDateTime, false);
		Todo t4 = new Todo(null, "Meditar", "frefre", localDateTime, true);
		Todo t5 = new Todo(null, "Trabalhar", "ferr", localDateTime, false);
		Todo t6 = new Todo(null, "Jogar", "frefreegrg", localDateTime, true);
		
		
		todoRepository.saveAll(Arrays.asList(t1, t2, t3, t4, t5, t6));
	}

}
