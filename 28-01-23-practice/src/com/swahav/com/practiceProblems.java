package com.swahav.com;

import java.util.Scanner;

public class practiceProblems {

	public static void main(String[] args) {
		System.out.println("*****Two Numbers Calculator******");
		int a;
		int b;
		System.out.println("Enter Two Numbers:");
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		b = sc.nextInt();
		int result = a + b;
		{
			System.out.println("The Addition of two numbers is:" + result);
		}
		int subtraction=a-b;
		{
			System.out.println("The Subtraction of two numbers is:"+subtraction);
		}
		int multiplication=a*b;
		{
			System.out.println("The Multiplication of two numbers is:"+multiplication);
		}
		int division=a/b;
		{
			System.out.println("The Division of two numbers is:"+division);
		}

		sc.close();

	}

}