package com.javaprgm;

public class CountVowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s ="text count vowels";
		char ch;
		int j= 0;
		int count =0;
		for(int i=0;i<s.length();i++) {
			ch = s.charAt(i);
			switch(ch) {
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
			case 'A':
			case 'E':
			case 'I':
			case 'O':
			case 'U':
				j=1;
				count++;
				System.out.println(ch);
			}
		}
		if(j==0) {
			System.out.println("no vowels");
		}
		else
			System.out.println("total vowels are "+count);
	}

}
