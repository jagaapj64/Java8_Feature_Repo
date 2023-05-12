package com.java.collection.features;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
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
		
		List<Employee> emp2 = new ArrayList<>();
		emp2.add(new Employee(100, "Guru"));
		emp2.add(new Employee(145, "Thiru"));
		emp2.add(new Employee(167, "Daniel"));
		emp2.add(new Employee(10, "Jhon"));
		emp2.add(new Employee(890, "Mani"));
		emp2.stream().sorted(Comparator.comparing(Employee::geteId)).forEach(e->{
			System.out.println(e.geteName()+" "+e.geteId());
		});

	}

}
