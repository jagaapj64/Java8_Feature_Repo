package com.java8.features;

public class StaticMethodInFunctionalInterface implements DoableStatic {

	public static void main(String args[]) {
		/*
		 * here we override default method to our specific implementation based on
		 * Business logic but static method we can't override method and we can call static method directly using Interface
		 */ 
		DoableStatic staticMethod = new StaticMethodInFunctionalInterface();
		staticMethod.doIt();
		staticMethod.workMore("Okay i will do ");
		/*
		 * Static Methods inside Java 8 Interface You can also define static methods
		 * inside the interface. Static methods are used to define utility methods.
		 */
		DoableStatic.workMoreOver("Okay i will try to complete ");

	}

	@Override
	public void workMore(String msg) {
		System.out.println(msg);

	}
}
