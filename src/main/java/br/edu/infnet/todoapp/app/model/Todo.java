package br.edu.infnet.todoapp.app.model;

public class Todo {
	
	private String id; 
	
	private String tarefa;
	
	private Boolean pronto;
	
	public Todo() {
	}

	public Todo(String tarefa, Boolean pronto) {
		super();
		this.tarefa = tarefa;
		this.pronto = pronto;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTarefa() {
		return tarefa;
	}

	public void setTarefa(String tarefa) {
		this.tarefa = tarefa;
	}

	public Boolean getPronto() {
		return pronto;
	}

	public void setPronto(Boolean pronto) {
		this.pronto = pronto;
	}

	
}
