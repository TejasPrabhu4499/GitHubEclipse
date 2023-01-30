package com.aurionpro.homework;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		System.out.println("*****Fibonacci Series Calculator:*****");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Number");
		int n = sc.nextInt();
		calcFibonacci(n);
		sc.close();
	}

	private static void calcFibonacci(int n) {
		int a = 0, b = 1;
		System.out.print(a + " " + b);
		int c;
		for (int i = 2; i < n; i++) {
			c = a + b;
			System.out.print(" " + c);
			a = b;
			b = c;

		}
	}
}