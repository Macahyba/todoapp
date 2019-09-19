package br.edu.infnet.todoapp.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import br.edu.infnet.todoapp.model.Usuario;

@Repository
public class UsuarioDao extends GenericDao<Usuario> {

	@Override
	public List<Usuario> getAll() {
		return super.getEm().createQuery(" select t from Usuario t").getResultList();
	}

	@Override
	public Usuario getSingle(Integer t) {
		return super.getEm().find(Usuario.class, t);
	}

}
