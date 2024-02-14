package com.new_codings;

public class Amstring {

	
	private static void ams() {
		   int number = 153;
	        int originalNumber = number;
	        int result = 0;
	        
	        while (number != 0) {
	            int digit = number % 10;
	            result += Math.pow(digit, 3);
	            number /= 10;
	        }

	        if (result == originalNumber) {
	            System.out.println(originalNumber + " is an Armstrong number.");
	        } else {
	            System.out.println(originalNumber + " is not an Armstrong number.");
	        }
	}
	
	
	
	private void Arraydata() {
		

	}
	
	public static void main(String[] args) {
		ams();
	}
}
