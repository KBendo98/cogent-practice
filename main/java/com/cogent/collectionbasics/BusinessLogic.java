package com.cogent.collectionbasics;

import java.util.ArrayList;
import java.util.List;

public class BusinessLogic {
	private List<Employee> l = new ArrayList<>();
	
	public List<Employee> getList() {
		return l;
	}
	
	public void process(int n) {
		for(int i=0; i<n; i++) {
			l.add(new Employee());
		}
	}
}
