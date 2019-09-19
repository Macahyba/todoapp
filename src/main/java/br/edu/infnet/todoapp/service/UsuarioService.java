package br.edu.infnet.todoapp.service;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import br.edu.infnet.todoapp.dao.UsuarioDao;
import br.edu.infnet.todoapp.model.Usuario;

@Service
public class UsuarioService {
 
	@Autowired
	private UsuarioDao dao;
	
	public UsuarioService() {

	}

	@Transactional(propagation = Propagation.NEVER)
	public List<Usuario> getUsuario() {
		
		return dao.getAll();
	}

	@Transactional(propagation = Propagation.REQUIRED)
	public void persiste(Usuario usuario) {
		dao.salvar(usuario);
	}

	@Transactional(propagation = Propagation.REQUIRED)
	public void update(Usuario usuario) {		
		dao.editar(usuario);
	}

	@Transactional(propagation = Propagation.REQUIRED)
	public void delete(String id) {
		dao.delete(Integer.valueOf(id));
	}
	
	@Transactional(propagation = Propagation.NEVER)
	public Usuario getUsuario(String id) {
		Objects.requireNonNull(id, "Id nulo!");	
		return dao.getSingle(Integer.valueOf(id));
	}

	public UsuarioDao getDao() {
		return dao;
	}

	public void setDao(UsuarioDao dao) {
		this.dao = dao;
	}

}
