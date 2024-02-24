package com.new_codings;

import java.util.HashMap;
import java.util.HashSet;

public class Word_and_Character_Count {
	
//	count of occurrence of char ----------------------------------------------
	private static void charactercount() {
         String str="javaproaram";
         
         String[] split = str.split("");
             HashMap<String, Integer> map=new HashMap<>();  
             HashSet<String> hh=new HashSet<String>();
            for ( String c :split) {
               if (!hh.contains(c)) {
	         hh.add(c);
            }else {
         	System.out.println("already in");
           }
           }
            System.out.println(hh);
	}
	
	
//	count of occurrence of words --------------------------------------
	private static void wordscount() {
                    
	String	str="i am a java tester Java is my primary language";
	
	int length = str.split(" ").length;
	System.out.println(length);
	
	String[] split = str.split(" ");
	   HashMap<String, Integer> data=new HashMap<>();
	   
		for (String s : split) {
			String ls = s.toLowerCase();
			
			 if (data.containsKey(ls)) {
		          data.put(ls, data.get(ls)+1);
	            }else {
	         	data.put(ls, 1);
	           }		
		}	
		System.out.println(data);
   
	}
	
	public static void main(String[] args) {
		charactercount();
	}
	
}
