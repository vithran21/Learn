package com.learnjava;

import java.util.Scanner;

/*
 * n th value of Fibonacci number
 */
public class FibonnaciSeriesNthNumber {

	public static void main(String args[]) {
		try (Scanner input = new Scanner(System.in)) {
			System.out.println("Enter the nth number to be found in Fibonacci series: ");
			int n = input.nextInt();

			int a = 0;
			int b = 1;
			int count = 2;
			
			int[] f = new int[n];

			while (count <= n) {
				int temp = b;
				b = a + b;
				a = temp;
				f[count-1] = b;
				count += 1;
			}
			
			System.out.println("Fibonacci series: ");
			for (int i : f) {
				System.out.println(i);
			}

			System.out.println("n="+n+" value in Fib Series is " + b);
		}
	}
}
