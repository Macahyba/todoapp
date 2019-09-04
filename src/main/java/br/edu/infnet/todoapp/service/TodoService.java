package br.edu.infnet.todoapp.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import br.edu.infnet.todoapp.app.model.Todo;



@Service
public class TodoService {
 
	private static List<Todo> repositorio;
	
	public TodoService() {
		repositorio = new ArrayList<Todo>();
	}
	
	public List<Todo> getTodos() {
		
		return repositorio;
	}

	public void persiste(Todo todo) {
		repositorio.add(todo);
	}

	public void update(Todo todo) {		
		repositorio.set(Integer.valueOf(todo.getId()), todo);
	}

	public void delete(Todo todo) {
		repositorio.remove(todo);
	}
	
	public Todo getTodo(String id) {
		return repositorio.get(Integer.parseInt(id));
	}

}
