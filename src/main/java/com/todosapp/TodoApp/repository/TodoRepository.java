package com.todosapp.TodoApp.repository;

import java.util.List;

import com.todosapp.TodoApp.model.Todo;

public interface TodoRepository {

    public abstract List<Todo> getListOfTodos();
}
