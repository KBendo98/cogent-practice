package com.cogent.exception;

public class Car extends Vehicle{
	void perform() {
		System.out.println(10/0);
	}
}
