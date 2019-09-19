package br.edu.infnet.todoapp.dao;

import java.util.List;


public interface IDao<T> {

	public void salvar(T t);
	
	public void delete(Integer t);
	
	public void editar(T t);
	
	public T getSingle(Integer t);
	
	public List<T> getAll();
}
