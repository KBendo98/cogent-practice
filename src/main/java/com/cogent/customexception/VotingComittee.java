package com.cogent.customexception;

public class VotingComittee {
	private int age;
	
	public VotingComittee(int age) {
		this.age = age;
	}
	
	void ageChecker() throws AgeCriteriaException {
		if(age < 18)
			throw new AgeCriteriaException();
		else {
			System.out.println("Registered for voting.");
		}
	}
}
