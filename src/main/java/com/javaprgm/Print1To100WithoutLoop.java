package com.javaprgm;

public class Print1To100WithoutLoop {
	public static void main(String args[]) {
		printNos(1, 100);
	}

	private static void printNos(int initial, int last) {
		if (initial <= last) {
			System.out.print(initial +"\n");
			printNos(initial + 1, last);
		}
	}

}
