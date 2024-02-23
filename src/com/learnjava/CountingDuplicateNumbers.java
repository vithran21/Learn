package com.learnjava;

import java.util.Scanner;

public class CountingDuplicateNumbers {

	public static void main(String[] args) {
		System.out.println("Enter the number: ");
		Scanner in = new Scanner(System.in);
		long number = in.nextLong();

		System.out.println("Enter the number to be counted: ");
		int f = in.nextInt();
		int count = 0;

		while (number > 0) {
			if (number % 10 == f)
				count++;
			number = number / 10;
		}
		System.out.println("Number of " + f + "'s in entered number is " + count);
	}

}
