package com.aurionpro.homework;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		int temp,sum=0,r;
		System.out.println("****Palindrome Number*****");
 Scanner sc=new Scanner(System.in);
 System.out.println("Enter the Number to Check whteher the Number is Palindrome Number:");
 int input=sc.nextInt();
 temp=input;
 while(input>0) {
	 r=input%10;
	 sum=(sum*10)+r;
	 input=input/10;
 }
 if(temp==sum)
	 System.out.println("The Number is Palindrome");
 else
	 
	 System.out.println("The Number is Not a Palindrome Number");
 
	}

}
