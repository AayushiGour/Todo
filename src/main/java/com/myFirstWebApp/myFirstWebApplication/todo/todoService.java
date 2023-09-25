package com.myFirstWebApp.myFirstWebApplication.todo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class todoService {
	private static List<Todo> todos=new ArrayList<>();
	private static int todosCount=0;
	
	static {
		todos.add(new Todo(++todosCount,"Learning with TCS","Learn AWS",LocalDate.now().plusYears(1),false));
		todos.add(new Todo(++todosCount,"Learning with TCS","Learn Devops",LocalDate.now().plusYears(2),false));
		todos.add(new Todo(++todosCount,"Learning with TCS","Learn Full stack Development",LocalDate.now().plusYears(3),false));
	}
	
	public List<Todo> findByUserName(String username){
		return todos;
	}
	
	public void addNewTodo(String username,String description,LocalDate targetDate,boolean done){
		Todo todo=new Todo(++todosCount,username,description,targetDate,done);
		todos.add(todo);
	}
	
}
