package com.java.collection.features;

import java.util.TreeSet;

public class EmployeeComparatorComparableMain {

	public static void main(String[] args) {

		TreeSet<Employee> emp=new TreeSet<Employee>();
		emp.add(new Employee(100, "Guru"));
		emp.add(new Employee(145, "Thiru"));
		emp.add(new Employee(167, "Daniel"));
		emp.add(new Employee(10, "Jhon"));
		emp.add(new Employee(890, "Mani")); 
		emp.forEach(e->{
        System.out.println(e.geteId()+" "+e.geteName());   
		});

		TreeSet<Employee> emp1=new TreeSet<Employee>(new EmployeeMyComparator());
		emp1.add(new Employee(100, "Guru"));
		emp1.add(new Employee(145, "Thiru"));
		emp1.add(new Employee(167, "Daniel"));
		emp1.add(new Employee(10, "Jhon"));
		emp1.add(new Employee(890, "Mani")); 
		emp1.forEach(e->{
	        System.out.println(e.geteName()+" "+e.geteId());   
			});

	}

}
