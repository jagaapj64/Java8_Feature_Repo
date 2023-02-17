package com.java8.features;

public abstract class AbstractClass {

	/*
	 * After having default and static methods inside the interface, we think about
	 * the need of abstract class in Java. An interface and an abstract class is
	 * almost similar except that you can create constructor in the abstract class
	 * whereas you can't do this in interface.
	 */	
	public AbstractClass() {
		/*
		 * you can create constructor in the abstract class whereas you can't do this in
		 * interface.
		 */		
		System.out.println("We can create constructors in abstract class ");
	}

	abstract int add(int a, int b); // abstract method

	int sub(int a, int b) { // non-abstract method
		return a - b;
	}

	static int multiply(int a, int b) { // static method
		return a * b;
	}
}
