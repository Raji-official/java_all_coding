package com.new_codings;

public class Palindrome {

private static void palindrome(String str) {
	String s=str;
	String reversedStr = "";

	for (int i = 0; i < str.length(); i++) {
	  reversedStr = str.charAt(i) + reversedStr;
	  System.out.println(reversedStr);
	}
      if (s.equals(reversedStr)) {
		System.out.println("palindrome");
	}else {
		System.out.println("not a palindrome");
	}
      
}
public static void main(String[] args) {
	palindrome("raji");
}
}
