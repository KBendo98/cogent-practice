package com.cogent.exercises;

public class Swap2 {

	public static void main(String[] args) {
		int x = -67, y = 23;
		
		x = x+y;
		y = x-y;
		x = x-y;
		
		System.out.println("x: " + x);
		System.out.println("y: " + y);
	}

}
