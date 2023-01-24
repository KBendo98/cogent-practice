package com.cogent.exercises;

public class MaxNumber {

	public static void main(String[] args) {
		double x = 10.5, y = -20.54;
		double max;
		
		if(x>y)
			max = x;
		else {
			max = y;
		}
		
		System.out.println("Max: " + max);
	}
}
