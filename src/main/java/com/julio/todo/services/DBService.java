package com.julio.todo.services;

import java.text.ParseException;
import java.text.SimpleDateFormat;
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
	public void instanciaBaseDados() throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		Todo t1 = new Todo(null, "Estudar", "Estudar Spring Boot e Angular", sdf.parse("03/03/2022"), false);
		Todo t2 = new Todo(null, "Exercitar", "Praticar exercicio fisico", sdf.parse("03/03/2022"), false);
		Todo t3 = new Todo(null, "Ler", "Ler um livro para aumentar nivel", sdf.parse("03/03/2022"), true);
		Todo t4 = new Todo(null, "Meditar", "Meditar para manter calma", sdf.parse("03/03/2022"), false);
		Todo t5 = new Todo(null, "Lutar", "Estudar Spring Boot e Angular", sdf.parse("03/03/2022"), true);
		Todo t6 = new Todo(null, "Gritar", "Estudar Spring Boot e Angular", sdf.parse("03/03/2022"), false);
		
		todoRepository.saveAll(Arrays.asList(t1, t2, t3, t4, t5, t6));
	}

}
