package com.new_codings;

import java.util.Arrays;

public class BubbleSort {

static void bubbleSortAlgorithm(int array[]) {
    int size = array.length;
    
    for (int i = 0; i < size-1; i++) {
    
      for (int j = 0; j < size-1; j++) {
      
        if (array[j] > array[j + 1]) {
          int temp = array[j];
         
          array[j] = array[j + 1];
          array[j + 1] = temp;
        }
        }
  }
}
	

	public static void main(String[] args) {
		
		int[] data = { 6, 5, 8, 1, 2 };
		    
		    bubbleSortAlgorithm(data);
		    System.out.println(Arrays.toString(data));
		  
	}

}
