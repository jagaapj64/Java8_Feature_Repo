package com.java8.features;

public class DefaultMethodFuntionalInterface implements DoableDefault {

	@Override
	public String  workMore(String msg) {
		return msg;

	}

	public static void main(String[] args) {
		
		/*
		 * Java provides a facility to create default methods inside the interface.
		 * Methods which are defined inside the interface and tagged with default are
		 * known as default methods. These methods are non-abstract methods.
		 */		
		/*
		 * In the following example, Sayable is a functional interface that contains a
		 * default and an abstract method. The concept of default method is used to
		 * define a method with default implementation. You can override default method
		 * also to provide more specific implementation for the method.
		 */		
		DefaultMethodFuntionalInterface doing=new DefaultMethodFuntionalInterface();
		doing.doIt();
	    System.out.println(doing.workMore("Okay i will do"));

	}

}
