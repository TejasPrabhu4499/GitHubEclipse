package com.aurionpro.homework;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
System.out.println("****Armstrong Number Checker****");
int numoriginal,cubesum=0,digit;
Scanner sc=new Scanner(System.in);
System.out.println("Enter The Number to be checked:");
int input=sc.nextInt();
numoriginal=input;
while(input!=0)
{
	digit=input%10;
	cubesum+=Math.pow(digit,3); 
			input/=10;
}
 if(cubesum==numoriginal)
  System.out.println(numoriginal+" is an Armstrong Number");
 else
  System.out.println(numoriginal+" is not an Armstrong Number");
sc.close();
	}
}
