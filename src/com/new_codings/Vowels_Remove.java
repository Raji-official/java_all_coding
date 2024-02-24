package com.new_codings;

import java.util.Arrays;

public class Vowels_Remove {

	
	
	
    private static void vowel(String s) {
        String[] split = s.split(" ");
        StringBuilder result = new StringBuilder();

        for (String word : split) {
            boolean containsVowel = false;

            for (int j = 0; j < word.length(); j++) {
                char charAt = word.charAt(1);

                if (charAt == 'a' || charAt == 'o' || charAt == 'i' || charAt == 'e' || charAt == 'u') {
                    containsVowel = true;
                    break;
                }
            }

            if (!containsVowel) {
                result.append(word).append(" ");
            }
        }

        System.out.println("Result without words containing vowels: " + result.toString().trim());
    }

    
    
    
    
    
    
    
    
    
    private static void vowelletter(String s) {
        String[] split = s.split("");
        StringBuilder result = new StringBuilder();
        String res = "";

        for (String word : split) {
            boolean containsVowel = false;

            for (int j = 0; j < word.length(); j++) {
                char charAt = word.charAt(j);

                if (charAt == 'a' || charAt == 'o' || charAt == 'i' || charAt == 'e' || charAt == 'u') {
                    containsVowel = true;
                    break;
                }
            }

            if (!containsVowel) {
//                result.append(word).append("");
            	res +=word;
            }
        }

        System.out.println("Result without words containing vowels: " + res.toString().trim());
    }
    
    
    
    
    
    
 
    
    
    private static void numberswap(int s) {
    	 

    	    // Convert the integer to a string for easy manipulation
    	    String sString = Integer.toString(s);

    	    // Swap digits at positions 3 and 7
    	    char[] charArray = sString.toCharArray();
    	    char temp = charArray[2];
    	    charArray[2] = charArray[6];
    	    charArray[6] = temp;

    	    // Convert back to integer
    	    int result = Integer.parseInt(new String(charArray));

    	    System.out.println(result);
    	}
    
    

    	    
    	    
    
    
    public static void main(String[] args) {
    	vowel("yes am raji from poompuhar");
        vowelletter("yes am raji from poompuhar");
        
    numberswap(12345678);
    
    
    String s = "i am raji iam rio chennai";

    // Split the original string into words
    String[] words = s.split(" ");

    // Swap the positions of "ri" and "raji"
    int rioIndex = indexOf(words, "rio");
    int rajiIndex = indexOf(words, "raji");
    if (rioIndex != -1 && rajiIndex != -1) {
        String temp = words[rioIndex];
        words[rioIndex] = words[rajiIndex];
        words[rajiIndex] = temp;
    }

    // Join the words back into a new string
    String result = String.join(" ", words);

    // Print the result
    System.out.println(result);
}

// Helper method to find the index of a word in the array
private static int indexOf(String[] array, String target) {
    for (int i = 0; i < array.length; i++) {
        if (array[i].equals(target)) {
            return i;
        }
    }
    return -1; // Return -1 if the target is not found
    
    
    
    }
	
}
