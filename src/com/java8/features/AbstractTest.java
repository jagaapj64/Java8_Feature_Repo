package com.java8.features;

public class AbstractTest extends AbstractClass {

	@Override
	int add(int a, int b) {
		// TODO Auto-generated method stub
		return a + b;
	}

	public static void main(String[] args) {
		AbstractTest a = new AbstractTest();
		int result1 = a.add(20, 10); // calling abstract method
		int result2 = a.sub(20, 10); // calling non-abstract method
		int result3 = AbstractClass.multiply(20, 10); // calling static method
		int result4 = AbstractTest.multiply(20, 50); // calling static method
		System.out.println("Addition: " + result1);
		System.out.println("Substraction: " + result2);
		System.out.println("Multiplication Calling AbstractClass : " + result3);
		System.out.println("Multiplication Calling AbstractTest : " + result4);
	}

}
