package com.cogent.collectionbasics;
import java.util.Collections;
import java.util.Scanner;

public class Tester {

	final static int OPEN_SLOTS = 5;
	
	public static void main(String[] args) {
		BusinessLogic b = new BusinessLogic();
		Scanner scan = new Scanner(System.in);
		
		b.process(OPEN_SLOTS);
		
		System.out.println("Insert info about employees: ");
		for(int i=0; i<OPEN_SLOTS; i++) {
			System.out.print("Id: ");
			Integer id = scan.nextInt();
			System.out.print("Name: ");
			String name = scan.next();
			System.out.print("Age: ");
			Integer age = scan.nextInt();
			System.out.print("Department: ");
			String dept = scan.next();
			System.out.print("Salary: ");
			Double salary = scan.nextDouble();
			
			b.getList().get(i).setId(id);
			b.getList().get(i).setName(name);
			b.getList().get(i).setAge(age);
			b.getList().get(i).setDept(dept);
			b.getList().get(i).setSalary(salary);
			
			System.out.println("----------------");
		}
		scan.close();
		
		System.out.println("Before Sorting: ");
		for(Employee e:b.getList()) {
			System.out.println(e);
		}
		
		System.out.println("\nAfter Sorting: ");
		Collections.sort(b.getList(), new AgeComparator());
		for(Employee e:b.getList()) {
			System.out.println(e);
		}
	}

}
