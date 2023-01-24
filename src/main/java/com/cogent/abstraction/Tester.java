package com.cogent.abstraction;

public class Tester {

	public static void main(String[] args) {
		Electronics e = new Radio();
		Machine m = new Radio();
		
		e.start();
		m.volumeController();
		m.engineProcess();
	}

}
