package br.edu.infnet.todoapp.model.persistence;

import java.util.List;


public interface IDao<T> {

	public void salvar(T t);
	
	public void deletar(Integer t);
	
	public void editar(T t);
	
	public T findOne(Integer t);
	
	public List<T> getAll();
}
