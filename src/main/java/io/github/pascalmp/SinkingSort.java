package io.github.pascalmp;

public class SinkingSort {

	public static int[] sort(int[] array) {
		if(array[0] > array[1]){
			int num = array[1];
			array[1] = array[0];
			array[0] = num;
		}
		return array;
	}

}
