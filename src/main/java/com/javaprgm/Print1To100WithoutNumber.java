package com.javaprgm;

public class Print1To100WithoutNumber {
	public static void main(String args[]) {
		
	int one = 'a'/'a';         //one  = 1
	
//	1.first method
	String s = "aaaaaaaaaa";	//s = with 10 char of a
	for(int I = one; I<=(s.length()*s.length()); I++){
		System.out.println(I);
	}
	
//	2.second method
	for(int j = one; j<='d'; j++){     //ascii number of d = 100
	System.out.println(j);
	}
//	Update
	
}
}
