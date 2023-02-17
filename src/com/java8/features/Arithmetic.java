package com.java8.features;

@FunctionalInterface
public interface Arithmetic {

	public int add(int a, int b);
	
	// when we declare another method compiler showing it is invalid @FunctionalInterface because it SAM interface then lamda expression implements
//	public int sub(int a, int b);
}
