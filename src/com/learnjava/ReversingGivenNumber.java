package com.learnjava;

import java.util.Scanner;

public class ReversingGivenNumber {

	public static void main(String[] args) {
		System.out.println("Enter the number to be reversed: ");
		Scanner in = new Scanner(System.in);
		long num = in.nextLong();
		long rev = 0;

		while (num > 0) {
			rev = rev * 10 + num % 10;
			num = num / 10;
		}

		System.out.println("Reversed: " + rev);

	}

}
