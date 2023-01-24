package com.cogent.abstraction;

public abstract class Machine {
	void engineProcess() {
		System.out.println("Engine Process");
	}
	
	abstract void volumeController();
}
