package com.new_codings;



public class Factorial {
private static int fac(int n) {
	if (n == 0)  {  
	    return 1; 
	}
	  else    {
	    return(n * fac(n-1));    
	 }    

}



public static void main(String[] args) {
	int fac = fac(4);
	System.out.println(fac);

	

	
	
}
}
