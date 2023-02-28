package com.todosapp.TodoApp.repository;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.todosapp.TodoApp.model.Todo;

@Repository
public class TodoRepositoryImpl implements TodoRepository {

	private List<Todo> todosList;
	@Override
	public List<Todo> getListOfTodos() {
		// TODO Auto-generated method stub
		
		todosList=new ArrayList<Todo> ();
		todosList.add(new Todo(1,"Learn AWS",LocalDate.now().plusDays(1),LocalDate.now().plusMonths(3),"Not Completed"));
		todosList.add(new Todo(2,"Learn Spring Boot",LocalDate.now().plusDays(5),LocalDate.now().plusMonths(2),"Not Completed"));
		todosList.add(new Todo(3,"Learn RestAPIs",LocalDate.now().plusDays(3),LocalDate.now().plusMonths(4),"Not Completed"));
		todosList.add(new Todo(4,"Learn java",LocalDate.now().plusDays(9),LocalDate.now().plusMonths(1),"Not Completed"));
		
		return todosList;
	}

}
