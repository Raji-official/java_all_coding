package com.new_codings;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Interview_coding {

	

	
	public static void main(String[] args) {
		
		int a[]=new int[3];
		a[0]=23;
		a[1]=22;
		a[2]=12;
		System.out.println(a[0]);
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
			
		}
		for (int i : a) {
			System.out.println(i);
		}
		
		
		
		
		
		   String input = "Java is a programming language. Python is also a programming language.";
		      input = input.toLowerCase();
		      String[] strArray = input.split(" ");
		      List<String> repeatedWords = new ArrayList<>();
		      HashSet<String> uniqueWords = new HashSet<>();
		      for(String str : strArray)
		      {
		          if (!uniqueWords.add(str))
		            repeatedWords.add(str);
		      }
		      System.out.println(repeatedWords);
		
	}
	




}
