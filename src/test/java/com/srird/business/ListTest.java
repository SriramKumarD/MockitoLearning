package com.srird.business;

import static org.junit.Assert.*;
import static org.mockito.Matchers.anyInt;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.List;

import org.junit.Test;

public class ListTest {

	@Test
	public void letsMockListSizeTest() {
		List mockList = mock(List.class);
		when(mockList.size()).thenReturn(2);
		assertEquals(2, mockList.size());
	}
	@Test
	public void letsMultipleMockListSizeTest() {
		List mockList = mock(List.class);
		when(mockList.size()).thenReturn(2).thenReturn(3);
		assertEquals(2, mockList.size());
		assertEquals(3, mockList.size());
		
	}
	
	@Test
	public void letsMockListGetTest() {
		List mockList = mock(List.class);
		
		//Argument matchers
		when(mockList.get(anyInt())).thenReturn(2);
		
		//when(mockList.get(0)).thenReturn(2);
		
		assertEquals(2, mockList.get(0));
		
	}
	
	@Test(expected = RuntimeException.class)
	public void letsMockListGetThrowExceptionTest() {
		List mockList = mock(List.class);
		
		//Argument matchers
		when(mockList.get(anyInt())).thenThrow(new RuntimeException("Something"));
		
		//when(mockList.get(0)).thenReturn(2);
		
		mockList.get(0);
	}

}
