package test2;

import java.util.Scanner;

public class FareCalculator {

	public static void main(String[] args) {
		System.out.println("Welcome to the Fare Calculator");
		Scanner sc = new Scanner(System.in);
		int total = 0;
		System.out.println("Please Enter Your Height in Cm's:");
		int height = sc.nextInt();
		if (height >= 120) {
			System.out.println("Can Ride");
			System.out.println("Enter Your Age:");
			int age = sc.nextInt();
			if (age < 12) {
				System.out.println("The Fare is 5$");
				total = 5;
			} else if (age >= 12 && age <= 18) {
				System.out.println("The Fare is 7$");
				total = 7;
			} else if (age > 18 && age < 45) {
				System.out.println("The Fare is 12$");
				total = 12;
			} else if (age > 45 && age <= 55) {
				System.out.println("The Fare is 3$");
				total = 3;
			} else {
				System.out.println("The fare is 0$");
				total = 0;
			}
			;
			System.out.println("Want Photos?Say Yes or No");
			String photos = sc.next();
			if (photos.equalsIgnoreCase("Yes")) {
				System.out.println("Extra 3$ charged for Photos");
				total += 3;
			} else {
				System.out.println("The Total Fare is:$" + total);
			}
		} else {
			System.out.println("Can't Ride");
		}
		System.out.println("Your total Fare is $" + total);

	}

}
