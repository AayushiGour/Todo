package com.myFirstWebApp.myFirstWebApplication.todo;

import java.time.LocalDate;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.SessionAttributes;

import jakarta.validation.Valid;

@SessionAttributes("name")
@Controller
public class TodoServiceController {
	
	private todoService TodoService;

	public TodoServiceController(todoService todoService) {
		super();
		TodoService = todoService;
	}
	
	@RequestMapping(value="list-todos")
	public String listAllTodos(ModelMap model) {
		List<Todo> todos=TodoService.findByUserName("Learning with TCS");
		model.addAttribute("todos",todos);
		return "todoList";
	}
	
	@RequestMapping(value="add-todos",method=RequestMethod.GET)
	public String ShowNewTodoPage(ModelMap model) {
		String username=(String)model.get("name");
		Todo todo=new Todo(0,username,"",LocalDate.now().plusYears(1),false);
		model.put("todo", todo);
		return "addTodo";
	}
	
	@RequestMapping(value="add-todos",method=RequestMethod.POST)
	public String AddNewTodo(ModelMap model,@Valid Todo todo,BindingResult result) {
		
		if(result.hasErrors()) {
			return "addTodo";
		}
		String username=(String)model.get("name");
		TodoService.addNewTodo(username,todo.getDescription(),LocalDate.now().plusYears(1),false);
		return "redirect:list-todos";
	}

}
