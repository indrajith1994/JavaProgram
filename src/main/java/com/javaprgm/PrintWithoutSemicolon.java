package com.javaprgm;

public class PrintWithoutSemicolon {

	public static void main(String[] args) {
		
		if(System.out.printf("Hello world") == null){
		}
		System.out.println();
		
		if(System.out.append("Hello world") == null){
		}
		System.out.println();
		
		if(System.out.append("Hello world").equals(null)){
		}
		System.out.println();
		
		for(int i = 0; i<1; System.out.println("hello world")){
		i++;
		}
	}

}
