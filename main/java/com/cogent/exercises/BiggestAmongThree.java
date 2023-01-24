package com.cogent.exercises;

public class BiggestAmongThree {

	public static void main(String[] args) {
		int x = -5, y = -3, z = 0;
		
		int biggest = x;
		
		if(y > biggest)
			biggest = y;
		if(z > biggest)
			biggest = z;
		
		System.out.println("Biggest: " + biggest);
	}
}
