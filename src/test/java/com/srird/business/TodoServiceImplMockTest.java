package com.srird.business;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import com.srird.data.api.TodoService;
import com.srird.data.business.TodoBusinessImpl;

public class TodoServiceImplMockTest {

	@Test
	public void testRetrieveTodosRelatedToSpringUsingMockTest() {
		
		TodoService todoService = mock(TodoService.class);
		
		List<String> todos = Arrays.asList("Learn Spring MVC", "Learn Spring Boot",
				"Learn REST");
				
		when(todoService.retrieveTodos("Dummy")).thenReturn(todos);
		
		TodoBusinessImpl todoBusinessImpl = new TodoBusinessImpl(todoService);

		List<String> filteredTodos = todoBusinessImpl
				.retrieveTodosRelatedToSpring("Dummy");
		
		assertEquals(2, filteredTodos.size());
	}

	@Test
	public void testRetrieveTodosRelatedToSpringUsingMockEmptyTest() {
		
		TodoService todoService = mock(TodoService.class);
		
		List<String> todos = Arrays.asList();
				
		when(todoService.retrieveTodos("Dummy")).thenReturn(todos);
		
		TodoBusinessImpl todoBusinessImpl = new TodoBusinessImpl(todoService);

		List<String> filteredTodos = todoBusinessImpl
				.retrieveTodosRelatedToSpring("Dummy");
		
		assertEquals(0, filteredTodos.size());
	}
}
