package com.todosapp.TodoApp.controller;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.todosapp.TodoApp.model.Todo;
import com.todosapp.TodoApp.service.TodoService;

@Controller
//@SessionAttributes("name")
public class TodoController {

	@Autowired
	TodoService todoService;
	
	
	@RequestMapping("/")
	public String helloController() {
		return "home";
	}
	
	
	@RequestMapping("Display-todos")
	public String displayTodos(ModelMap model) {
		
		List<Todo> todoList=todoService.displayTodoList();
		model.addAttribute("todoList", todoList);
		
		return "list-todos";
	}
	
	
	@RequestMapping(value="/add-todo",method=RequestMethod.GET)	
	public String handleAddTodo(ModelMap model) {
		Todo todo=new Todo(0,  "", LocalDate.now(),LocalDate.now().plusYears(1), "Not Completed");
		model.put("todo", todo);
		return "add-todo";
	}
	
	@RequestMapping(value="/add-todo", method=RequestMethod.POST)
	public String addNewTodo(ModelMap model, BindingResult result) {
		if(result.hasErrors())
			return "add-todo";
		
		
		return "redirect:list-todos";
	}
	

}
