package com.java.collection.features;

import java.util.Comparator;

public class EmployeeMyComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee e1, Employee e2) {
		return e1.geteName().compareTo(e2.geteName());
	}

}
