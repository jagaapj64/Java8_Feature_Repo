package com.java8.features;

@FunctionalInterface
public interface DoableStatic {

	/*
	 * Static Methods inside Java 8 Interface You can also define static methods
	 * inside the interface. Static methods are used to define utility methods.
	 */
	public default void doIt() {
		System.out.println("Do it Now ");
	}
	
	public void workMore(String msg);
	
   static void workMoreOver(String msg) {
		System.out.println(msg);
	}
}
