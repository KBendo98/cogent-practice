package com.cogent.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class AgeSorting {

	public static void main(String[] args) {
		List<Employee> employees = Arrays.asList(
				new Employee(100, "Jay", 20, "Finance", 1024.2),
				new Employee(101, "Sarah", 18, "IT", 3247.4),
				new Employee(102, "Sam", 30, "HR", 2325.5),
				new Employee(103, "Park", 25, "Maintenance", 1394.0),
				new Employee(104, "Kim", 23, "Desk", 1234.0));
		
		List<Employee> sorted = employees.stream()
			.sorted((e1, e2)->e1.getAge().compareTo(e2.getAge()))
			.collect(Collectors.toList());
		
		for(Employee e:sorted)
			System.out.println(e);
	}

}
