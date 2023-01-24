package com.cogent.jdbc;

public class Tester {

	public static void main(String[] args) {
		BusinessLogic bLogic = new BusinessLogic();
		
		try {
			// Load the Driver
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (Exception e) {
			System.out.println(e.getMessage() + " not found");
		}
		
		// Operations
		//bLogic.create(103, "Noel", "Research", 34573.6f);
		bLogic.read();
		//bLogic.update(100, "Jay", "Marketing", 40066.7f);
		//bLogic.delete(100);
	}

}
