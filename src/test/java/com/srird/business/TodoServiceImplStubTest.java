package com.srird.business;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import com.srird.data.api.TodoService;
import com.srird.data.api.TodoServiceStub;
import com.srird.data.business.TodoBusinessImpl;

public class TodoServiceImplStubTest {

	
	@Test
	public void testRetrieveTodosRelatedToSpringUsingTestStub() {
		
		TodoService todoService = new TodoServiceStub();
		TodoBusinessImpl todoBusinessImpl = new TodoBusinessImpl(todoService);

		List<String> filteredTodos = todoBusinessImpl
				.retrieveTodosRelatedToSpring("Dummy");
		
		assertEquals(2, filteredTodos.size());
	}

}
