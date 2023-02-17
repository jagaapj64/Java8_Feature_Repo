package com.java8.features;

@FunctionalInterface
public interface DoableDefault {

	/*
	 * Java provides a facility to create default methods inside the interface.
	 * Methods which are defined inside the interface and tagged with default are
	 * known as default methods. These methods are non-abstract methods.
	 * 
	 * Java provides a facility to create default methods inside the interface.
	 * Methods which are defined inside the interface and tagged with default are
	 * known as default methods. These methods are non-abstract methods.
	 */	
	public default void doIt() {
		System.out.println("Do it Now");
	}
	
	public String  workMore(String msg);
}
