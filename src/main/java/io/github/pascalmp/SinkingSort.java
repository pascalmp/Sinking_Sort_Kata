package io.github.pascalmp;

public class SinkingSort {

	public static int[] sort(int[] array) {
		
		for(int j = 1; j < array.length; j++)
		
		if(array[j -1] > array[j]){
			int num = array[j];
			array[j] = array[j -1];
			array[j - 1] = num;
			
		
		}
		return array;
	}

}
