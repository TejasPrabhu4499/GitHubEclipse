package test2;

import java.util.Scanner;

public class TreasureHunt {

	public static void main(String[] args) {
		System.out.println("Welcome to Treasure Island Your Mission is to find the Treasure");
		Scanner sc=new Scanner(System.in);
		System.out.println("Left or Right");
		String option = sc.next();
		if(option.equalsIgnoreCase("Left")){
			System.out.println("Swim or Wait");
			option = sc.next();
			if(option.equalsIgnoreCase("Wait")) {
				System.out.println("Which Door?Red,Yellow or Blue");
				option = sc.next();
				if(option.equalsIgnoreCase("Yellow")) {
					System.out.println("You Win");
				}
				else if (option.equalsIgnoreCase("Red")) {
					System.out.println("Burned By Fire,Game Over");
				}
				else if(option.equalsIgnoreCase("Blue")) {
					System.out.println("Eaten by Beast,Game Over");
				}
				else{
					System.out.println("Game Over");
				}
			}
			else {
				System.out.println("Attacked by trouts..Game Over");
			}
		}
		else {
			System.out.println("Fall in Hole..Game over");
		}
	}
}
					