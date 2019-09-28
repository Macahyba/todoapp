package br.edu.infnet.todoapp.model.persistence;

import java.lang.reflect.ParameterizedType;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;

public abstract class JpaDao<T> implements IDao<T> {

	@PersistenceContext
	private EntityManager em;
	
	private Class<T> classe;

	public JpaDao() {
		this.classe = ((Class<T>)((ParameterizedType)getClass().getGenericSuperclass()).getActualTypeArguments()[0]);
	}
	
	@Override
	public void salvar(T t) {
		em.persist(t);
	}

	@Override
	public void deletar(Integer id) {
		em.remove(findOne(id));
	}

	@Override
	public void editar(T t) {
		em.merge(t);
	}

	@Override
	public T findOne(Integer id) {
		return em.find(classe, id);
	}

	@Override
	public List<T> getAll(){
		CriteriaBuilder builder = em.getCriteriaBuilder();
		CriteriaQuery<T> query = builder.createQuery(classe);
		query.from(classe);
		return em.createQuery(query).getResultList();
	}

	public EntityManager getEm() {
		return em;
	}

	public void setEm(EntityManager em) {
		this.em = em;
	}

}
