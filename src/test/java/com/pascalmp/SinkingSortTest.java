package com.pascalmp;

import org.junit.Test;

import com.pascalmp.SinkingSort;

import static org.junit.Assert.assertArrayEquals;

public class SinkingSortTest {
	
	@Test
	public void shouldSortSortedList(){
		assertArrayEquals(new int[]{0, 1}, SinkingSort.sort(new int[]{0, 1}));
	}
	@Test
	public void shouldSortUnsortedListOfLengthTwo() throws Exception{
		assertArrayEquals(new int[]{0, 1}, SinkingSort.sort(new int[]{1, 0}));
		
	}
	@Test
	public void shouldSortPartiallySortedArrayListOfLengthThree() throws Exception{
		assertArrayEquals(new int[]{0, 1, 2}, SinkingSort.sort(new int[]{0, 2, 1}));
	}
	@Test
	public void shouldSortUnsortedArrayListOfLengthThree() throws Exception{
		assertArrayEquals(new int[]{0, 1, 2}, SinkingSort.sort(new int[]{2, 1, 0}));
	}
	

}
