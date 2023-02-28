package com.todosapp.TodoApp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.todosapp.TodoApp.model.Todo;
import com.todosapp.TodoApp.repository.TodoRepository;

@Service
public class TodoServiceImpl implements TodoService {

	@Autowired
	TodoRepository todoRepository;
	
	@Override
	public List<Todo> displayTodoList() {
		// TODO Auto-generated method stub
		return todoRepository.getListOfTodos();
	}
	
	

}
