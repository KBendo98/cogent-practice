package com.cogent.exercises;

public class Swap1 {

	public static void main(String[] args) {
		int x = 5, y = 10;
		int temp;
		
		temp = x;
		x = y;
		y = temp;
		
		System.out.println("x: " + x);
		System.out.println("y: " + y);
	}
}
