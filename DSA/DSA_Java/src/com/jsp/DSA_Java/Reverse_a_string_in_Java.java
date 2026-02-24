package com.jsp.DSA_Java;



public class Reverse_a_string_in_Java {

	public static void main(String[] args) {
		
		String str = "i love java";
		String rev = "";
	    for (int i = str.length()-1; i >= 0; i--) {
	    	
	    	 rev = rev + str.charAt(i);
			
		}	
	    
	    System.out.println(rev);
	}
}
