package com.hellospring.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.hellospring.domain.Todo;
import com.hellospring.service.TodoService;

@Controller
public class TodoController {

	@Autowired
	private TodoService service;

	@RequestMapping("/")
	public String index() {
		return "redirect:/list";
	}

	 @RequestMapping("/list")
	 public String list(Model model) {
	 	List<Todo> todoList = service.findTodoList();
	 	model.addAttribute("todoList", todoList);
	 	return "list";
	 }

	@GetMapping("/find")
	public String hello(Model model, @RequestParam(value = "title") String title, @RequestParam(value = "content") String content) {
		List<Todo> todoList = service.findTodoList(title);
		model.addAttribute("todoList", todoList);
		return "list";
	}

	@RequestMapping("/todos/{id}")
	public String todos(Model model, @PathVariable String id) {
		Todo todo = service.getTodo(Integer.parseInt(id));
		List<Todo> todoList = new ArrayList<Todo>();
		todoList.add(todo);
		model.addAttribute("todoList", todoList);
		return "list";
	}

	@RequestMapping("/newtodo")
	public String newtodo(Model model) {
		return "register";
	}

	@PostMapping("/register")
	public String register(Model model, @RequestParam(value = "id") String id, @RequestParam(value = "title") String title, @RequestParam(value = "content") String content) {
    	Todo todo = new Todo();
    	todo.setId(Integer.parseInt(id));
    	todo.setTitle(title);
    	todo.setContent(content);

    	// 登録
    	int ret = service.register(todo);
    	System.out.println(ret + "件登録");

    	// 検索
		List<Todo> todoList = service.findTodoList();
		model.addAttribute("todoList", todoList);
		return "redirect:/list"; // 登録系のあとはredirectにすること
	}

}
