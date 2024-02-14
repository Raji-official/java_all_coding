package com.new_codings;

import java.util.HashMap;

public class Word_and_Character_Count {
	
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
}
