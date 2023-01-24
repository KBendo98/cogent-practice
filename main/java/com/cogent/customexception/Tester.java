package com.cogent.customexception;

public class Tester {

	public static void main(String[] args){
		// TODO Auto-generated method stub
		VotingComittee v = new VotingComittee(17);
		//v.ageChecker();
		
		
		try {
			v.ageChecker();
		} catch (AgeCriteriaException e) {
			System.out.println("Can't Vote");
		}
		finally
		{
			System.out.println("Process completed.");
		}
		}
}
