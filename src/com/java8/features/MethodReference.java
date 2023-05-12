package com.java8.features;

import java.util.function.BiFunction;

public class MethodReference {

	
	public static void main(String args[]) {
		/*
		 * Java provides a new feature called method reference in Java 8. Method
		 * reference is used to refering the method to functional interface. It is compact and
		 * easy form of lambda expression. Each time when you are using lambda
		 * expression to just referring a method, you can replace your lambda expression
		 * with method reference.
		 */		
		//Example 1
//		1) Static Reference
		SayableMethodRef sayableMethodRef=SayableMethodRefImpl::saySomethingStatic;
		sayableMethodRef.say();
		
		/*
		 *Example 2 we are using predefined functional interface Runnable to refer
		 * static method.
		 */
		Thread t1=new Thread(SayableMethodRefImpl::ThreadStatusStatic);
		t1.start();
		

		/*// Example 3
		 * java.util.function.BiFunction<Integer, Integer, Integer>
		 *
		 * @FunctionalInterface
		 * 
		 * Represents a function that accepts two arguments and produces a result.This
		 * is the two-arity specialization of Function.
		 * 
		 * This is a functional interface whose functional method is apply(Object,Object). 
		 * Type Parameters:
		 * <T> the type of the first argument to the function
		 * <U> the type of the second argument to the function
		 * <R> the type of the result of the function
		 */
		BiFunction<Integer, Integer, Integer> adder=ArithmeticClass::add;
		int result=adder.apply(20, 49);
		System.out.println("result : "+result);
		
//		2) Non Static Reference
		// Creating object  Referring non-static method using reference 
		SayableMethodRefImpl methodReference=new SayableMethodRefImpl();
		SayableMethodRef sayableMethodRefNonStatic=methodReference::saySomethingNonStatic;
		
		sayableMethodRefNonStatic.say();
		
		// Referring non-static method using anonymous object  
		SayableMethodRef sayableMethodRefNonStatic2=new SayableMethodRefImpl()::saySomethingNonStatic;
		
		sayableMethodRefNonStatic2.say();
		
//		2) Constructor Reference
		
		Messageble hello=Message::new;
		hello.getMessage("Hello this is Constructor reference");
	}
}
