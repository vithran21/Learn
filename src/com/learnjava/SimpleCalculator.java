package com.learnjava;

import java.util.Scanner;

public class SimpleCalculator {

	public static void main(String[] args) {

		try (Scanner in = new Scanner(System.in)) {
			int ans = 0;

			while (true) {
				System.out.println("Enter an operator +,-,*,/,%  or press x to exit: ");

				char op = in.next().trim().charAt(0);

				if (op == 'x' || op == 'X') {
					break;
				} else if (op == '+' || op == '-' || op == '*' || op == '/' || op == '%') {
					System.out.println("Enter two numbers:");
					System.out.println("First Number: ");
					int num1 = in.nextInt();
					System.out.println("Second Number: ");
					int num2 = in.nextInt();

					if (op == '+') {
						ans = num1 + num2;
					} else if (op == '-') {
						ans = num1 - num2;
					} else if (op == '*') {
						ans = num1 * num2;
					} else if (op == '/') {
						ans = num1 / num2;
					} else if (op == '%') {
						ans = num1 % num2;
					}
					System.out.println(num1+""+op+""+num2+" is "+ans);
					System.out.println();
				} else {
					System.out.println("Invalid input!!");
				}
			}
		}
	}

}
