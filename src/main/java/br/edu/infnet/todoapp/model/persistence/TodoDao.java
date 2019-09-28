package br.edu.infnet.todoapp.model.persistence;

import org.springframework.stereotype.Repository;

import br.edu.infnet.todoapp.model.Todo;

@Repository
public class TodoDao  extends JpaDao<Todo>{

}
