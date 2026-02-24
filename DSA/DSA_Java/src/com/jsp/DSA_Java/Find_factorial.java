package com.jsp.DSA_Java;

public class Find_factorial {
public static void main(String[] args) {
	
	int num = 5;
	int fact = 1;
	for (int i = num; i > 0 ; i--) {
		 fact = fact * i ;
	}
	
	System.out.println("Factorial: "+fact);
}
}
