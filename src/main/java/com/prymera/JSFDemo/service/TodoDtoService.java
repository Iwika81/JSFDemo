package com.prymera.JSFDemo.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.prymera.JSFDemo.dao.Dao;
import com.prymera.JSFDemo.dto.TodoDto;

@Scope(value = "session")
@Component(value = "todoService")
public class TodoDtoService {

	@Autowired
	private Dao<TodoDto> todoDao;
	private TodoDto todo = new TodoDto();

	public void save() {
		todoDao.save(todo);
		todo = new TodoDto();
	}

	public Collection<TodoDto> getAllTodo() {
		return todoDao.getAll();
	}

	public int saveTodo(TodoDto todo) {
		validate(todo);
		return todoDao.save(todo);
	}

	private void validate(TodoDto todo) {
		// Details omitted
	}

	public TodoDto getTodo() {
		return todo;
	}
}
