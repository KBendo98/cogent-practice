package com.cogent.exception;

public class Vehicle {
	void process() {
		try {
			int[] arr = {1,2,3,4,5};
			System.out.println(arr[7]);
		} 
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Can't access index " + e.getMessage());
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
		finally {
			System.out.println("Finally");
		}
	}
}
