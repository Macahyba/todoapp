package br.edu.infnet.todoapp.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public abstract class GenericDao<T> implements IDao<T> {

	@PersistenceContext
	private EntityManager em;
	
	@Override
	public void salvar(T t) {
		em.persist(t);
	}

	@Override
	public void delete(Integer t) {
		em.remove(t);
	}

	@Override
	public void editar(T t) {
		em.merge(t);
	}

	@Override
	public abstract T getSingle(Integer t);

	@Override
	public abstract List<T> getAll();

	public EntityManager getEm() {
		return em;
	}

	public void setEm(EntityManager em) {
		this.em = em;
	}

}
