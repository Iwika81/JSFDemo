package com.prymera.JSFDemo.dao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;

import com.prymera.JSFDemo.dto.TodoDto;

public class TodoDtoDao implements Dao<TodoDto> {

	private List<TodoDto> todoList = new ArrayList<>();

	@Override
	public Optional<TodoDto> get(int id) {
		return Optional.ofNullable(todoList.get(id));
	}

	@Override
	public Collection<TodoDto> getAll() {
		return todoList.stream().filter(Objects::nonNull)
				.collect(Collectors.collectingAndThen(Collectors.toList(), Collections::unmodifiableList));
	}

	@Override
	public int save(TodoDto t) {
		todoList.add(t);
		int index = todoList.size() - 1;
		t.setId(index);
		return index;
	}

	@Override
	public void update(TodoDto t) {
		todoList.set(t.getId(), t);
	}

	@Override
	public void delete(TodoDto t) {
		todoList.set(t.getId(), null);
	}

}
