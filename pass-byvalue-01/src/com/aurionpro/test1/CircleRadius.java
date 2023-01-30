package com.aurionpro.test1;

import com.aurionpro.model.Circle;

public class CircleRadius {

	public static void main(String[] args) {
		Circle circle=new Circle();
		circle.radius=10;
		changeRadiusToZeroByValue(circle.radius);
		System.out.println(circle.radius);
		changeRadiusToZeroByReference(circle);
		System.out.println(circle.radius);
	}
	private static void changeRadiusToZeroByReference(Circle cir) {
		cir.radius=0;
		
	}
	private static void changeRadiusToZeroByValue(double radius) {
		radius=0;	
	}
}
