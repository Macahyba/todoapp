package br.edu.infnet.todoapp.service;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import br.edu.infnet.todoapp.dao.TodoDao;
import br.edu.infnet.todoapp.model.Todo;

@Service
public class TodoService {
 
	@Autowired
	private TodoDao dao;
	
	public TodoService() {

	}

	@Transactional(propagation = Propagation.NEVER)
	public List<Todo> getTodos() {
		
		return dao.getAll();
	}

	@Transactional(propagation = Propagation.REQUIRED)
	public void persiste(Todo todo) {
		dao.salvar(todo);
	}

	@Transactional(propagation = Propagation.REQUIRED)
	public void update(Todo todo) {		
		dao.editar(todo);
	}

	@Transactional(propagation = Propagation.REQUIRED)
	public void delete(String id) {
		dao.deletar(Integer.valueOf(id));
	}
	
	@Transactional(propagation = Propagation.NEVER)
	public Todo getTodo(String id) {
		Objects.requireNonNull(id, "Id nulo!");	
		return dao.getTodo(Integer.valueOf(id));
	}

	public TodoDao getDao() {
		return dao;
	}

	public void setDao(TodoDao dao) {
		this.dao = dao;
	}

}
