package test3;

import java.util.Scanner;

public class LoopExample {
	public static void main(String[] args) {
		for(int n=1;n<=100;n++) {
			boolean isPrime=true;
		for(int i=2;i<=n/2;i++)
			if(n%i==1) {
				System.out.println("The Number is Prime");
			}
			else {
				System.out.println("The Number is Not Prime");
			}
	}
}