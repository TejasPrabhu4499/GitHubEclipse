package com.aurionpro.test1;

public class PassByValue {

	public static void main(String[] args) {
		int number=10;
		convertNumberToZero(number);
		System.out.println(number);
	}
	public static void convertNumberToZero(int x) {
		x=0;
	}

}