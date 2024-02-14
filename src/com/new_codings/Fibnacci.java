package com.new_codings;

import java.util.ArrayList;

public class Fibnacci {

	private static void fibnac(int n) {
		int ac=0;
		int cu=1;
		int ans; 
		ArrayList<Integer> h=new ArrayList<Integer>();

		for (int i = 0; i < n; i++) {
			ans=ac+cu;
			h.add(ans);
			
			ac=cu;
			cu=ans;
		}
		System.out.println(h);


		}
	


	public static void main(String[] args) {
		fibnac(5);


}
}
