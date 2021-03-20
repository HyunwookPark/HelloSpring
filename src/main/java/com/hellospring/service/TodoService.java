package com.hellospring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hellospring.domain.Todo;
import com.hellospring.mapper.TodoListMapper;
import com.hellospring.mapper.TodoMapper;

@Service
public class TodoService {

	@Autowired
	private TodoMapper todoMapper;
	@Autowired
	private TodoListMapper todoListMapper;

	public Todo getTodo(int id) {
		Todo todo = todoMapper.select(id);
		System.out.println("ID       : " + todo.getId());
		System.out.println("TITLE    : " + todo.getTitle());
		System.out.println("CONTENT  : " + todo.getContent());
		return todo;
	}

	public List<Todo> findTodoList() {
		List<Todo> list = todoMapper.selectAll();
		for (Todo todo : list) {
			System.out.println("ID       : " + todo.getId());
			System.out.println("TITLE    : " + todo.getTitle());
			System.out.println("CONTENT  : " + todo.getContent());
		}
		return list;
	}

	public List<Todo> findTodoList(String title) {
		List<Todo> list = todoListMapper.selectList(title);
		for (Todo todo : list) {
			System.out.println("ID       : " + todo.getId());
			System.out.println("TITLE    : " + todo.getTitle());
			System.out.println("CONTENT  : " + todo.getContent());
		}
		return list;
	}

//	private int getInt() {
//		return 1;
//	}

    @Transactional
	public int register(Todo todo) {
		return todoMapper.insert(todo);
	}
}
