package com.new_codings;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Iterator;

public class Integer_Reverse {

	
	private static void reverse_integer() {

		int data=123456;
		int rev=0;
		
		while(data !=0) {
		rev=rev*10+data%10;
		data=data/10;
		}
		System.out.println(rev);
		
	}
	
	private static  void Arrayvalue_reverse() {
		int [] arr= {8,7,55,4,6,4,1,2,4};
		for (int i = arr.length-1; i >=0 ; i--) {
			System.out.println(arr[i]);
		}
	}
	
	
	private static void sort_integer() {

		int data=4659231;
	 char[] charArray = String.valueOf(data).toCharArray();
	 Arrays.sort(charArray);
	 
	 String valueOf = String.valueOf(charArray);
	 int parseInt = Integer.parseInt(valueOf);
	 System.out.println(parseInt);
		
		
	}
	
	
	private static  void Arrayvalue_sort() {
		int [] arr= {8,7,55,4,6,4,1,2,4};
		 Arrays.sort(arr);
		 System.out.println(Arrays.toString(arr));
	}  
	
	
	
	
	
	public static void main(String[] args) {
		reverse_integer();
		Arrayvalue_reverse();
	sort_integer();
	Arrayvalue_sort();
	
	}
	
} 
