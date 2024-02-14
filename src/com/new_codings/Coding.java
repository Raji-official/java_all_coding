 package com.new_codings;

import java.util.HashMap;
import java.util.Set;

public class Coding {
	
	
//	count of occurrence of char ----------------------------------------------
	private static void charactercount() {
         String str="javaproaram";
         
         String[] split = str.split("");
             HashMap<String, Integer> map=new HashMap<>();
//             Set<String> keySet = map.keySet();
             
//             Initially  map is empty match the letter include or not
//             if include the letter add count again come the letter
           
            for ( String c :split) {
            	 System.out.println(map);
               if (map.containsKey(c)) {
	          map.put(c, map.get(c)+1);
            }else {
         	map.put(c, 1);
           }
           }
            System.out.println(map);
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
	
//	count of occurrence of particular char --------------------------------------
	private static void particularcharcount() {
		String s="rajianjappan";
		char find='a';
		int count=0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i)==find) {
				count+=1;
			}
			
		}
		System.out.println("a"+count);
		
	}
	
	
	
//	count of occurrence of particular char --------------------------------------
	private static void allletter_count() {
		String str="rajianjappan";		
		String[] s = str.split("");
		   HashMap<String, Integer> data=new HashMap<>();
			for (String ss : s) {
				String ls = ss.toLowerCase();

			if (data.containsKey(ls)) {
				data.put(ls, data.get(ls)+1);
			}
			else {
				data.put(ls, 1);
			}	
		}
		System.out.println("aaaaa"+data);
		
	}
	
	
	
	
	
	private static void reverwords() {
		
		String str="raji";
		String reversed="";
	      for (int i = str.length() - 1; i >= 0; i--) {  
	            reversed += str.charAt(i);
	            System.out.println(reversed);
	}
		System.out.println("reverse :"+reversed);
	}
	

	
	private static void rev() {
		String originalStr = "Hello";
		String reversedStr = "";
		System.out.println(reversedStr);

		for (int i = 0; i < originalStr.length(); i++) {
		  reversedStr = originalStr.charAt(i) + reversedStr;
		  System.out.println(reversedStr);
		}

		System.out.println("Reversed string: "+ reversedStr);
	}
	
	
	
	
	private void primenumber() {
     
		
	}
	
	
	


	public static void main(String[] args) {

		charactercount();
		allletter_count();
		wordscount();
		particularcharcount();
		reverwords();
rev();
	}

}
