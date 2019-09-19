package br.edu.infnet.todoapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.edu.infnet.todoapp.model.Todo;
import br.edu.infnet.todoapp.service.TodoService;

@Controller
public class TodoController {

	@Autowired
	private TodoService service;
	
	@RequestMapping(value = {"/", "/index"} , method = RequestMethod.GET)
	public String home(Model model) {
		return "index";
	}

	@RequestMapping(value = "/todos/list", method = RequestMethod.GET)
	public String list(Model model) {
		List<Todo> todos = service.getTodos();
		model.addAttribute("listaTodos", todos);
		return "todos/list";
	}
	
	@RequestMapping(value = "/todos/form" , method = RequestMethod.GET)
	public String viewForm(Model model) {
		return "todos/form";
	}
	
	
	@RequestMapping(value = "/todos/add", method = RequestMethod.POST)
	public String save(Model model, Todo todo) {
		service.persiste(todo);
		return "redirect:/todos/list";
	}
	
	@RequestMapping(value = "/todos/edit/{id}", method = RequestMethod.GET)
	public String edit(@PathVariable("id") String id, Model model) {
		Todo todo = service.getTodo(id);
		model.addAttribute("todo", todo);
		model.addAttribute("id", id);
		return "todos/edit";
	}
	
	@RequestMapping(value = "/todos/update", method = RequestMethod.POST)
	public String update(Model model, Todo todo) {
		service.update(todo);
		return "redirect:/todos/list";
	}
	
	@RequestMapping(value = "/todos/delete/{id}", method = RequestMethod.GET)
	public String delete(@PathVariable("id") String id, Model model) {
		service.delete(id);
		return "redirect:/todos/list";
	}	
	
	public TodoService getService() {
		return service;
	}

	public void setService(TodoService service) {
		this.service = service;
	}
	
}
