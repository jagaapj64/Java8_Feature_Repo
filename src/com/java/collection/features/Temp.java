package com.java.collection.features;

public class Temp {

	public String toString() {
		return "temp";
		
	}
	public void finalize() {
		System.out.println("Finalize method is called");
	}
}
