package com.julio.todo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.julio.todo.domain.Todo;
import com.julio.todo.repositories.TodoRepository;
import com.julio.todo.services.exceptions.ObjectNotFoundException;

@Service
public class TodoService {

	@Autowired
	private TodoRepository todoRepository;

	public Todo findById(Integer id) {
		Optional<Todo> obj = todoRepository.findById(id);
		return obj.orElseThrow(
				() -> new ObjectNotFoundException("Object Not Found " + id + " Type: " + Todo.class.getName()));
	}

	public List<Todo> findAllOpen() {
		List<Todo> list = todoRepository.findAllOpen();
		return list;
	}

	public List<Todo> findAllClose() {
		List<Todo> list = todoRepository.findAllClose();
		return list;
	}

	public List<Todo> findAll() {
		List<Todo> list = todoRepository.findAll();
		return list;
	}

	public Todo create(Todo obj) {
		//Essa tratativa é para não setar um ID, pois ele é AUTO-ENCREMETE
		obj.setId(null);
		return todoRepository.save(obj);
	}

	public void delete(Integer id) {
		todoRepository.deleteById(id);
	}

	public Todo update(Integer id, Todo obj) {
		
		// 1 verificar se existe um objeto Todo com id que usuario passou como argumento
		//se não existir ele lança uma exceção tratada no primeiro End-Point
		
		Todo newObj = findById(id); 
		
		newObj.setTitulo(obj.getTitulo());
		newObj.setDataParaFinalizar(obj.getDataParaFinalizar());
		newObj.setDescricao(obj.getDescricao());
		newObj.setFinalizado(obj.getFinalizado());
		
		return todoRepository.save(newObj);
	}

}
