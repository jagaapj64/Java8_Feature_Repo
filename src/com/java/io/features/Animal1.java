package com.java.io.features;

public class Animal1 {

	public int getI() {
		return i;
	}

	public void setI(int i) {
		this.i = i;
	}

	int i=100;
	
	/*
	 * Exception in thread "main" java.io.InvalidClassException:
	 * com.java.io.features.Lion1; no valid constructor at
	 * java.base/java.io.ObjectStreamClass$ExceptionInfo.newInvalidClassException(
	 * ObjectStreamClass.java:172) at
	 * java.base/java.io.ObjectStreamClass.checkDeserialize(ObjectStreamClass.java:
	 * 790) at
	 * java.base/java.io.ObjectInputStream.readOrdinaryObject(ObjectInputStream.java
	 * :2225) at
	 * java.base/java.io.ObjectInputStream.readObject0(ObjectInputStream.java:1733)
	 * at java.base/java.io.ObjectInputStream.readObject(ObjectInputStream.java:509)
	 * at java.base/java.io.ObjectInputStream.readObject(ObjectInputStream.java:467)
	 * at com.java.io.features.SerializationWithInheritance.main(
	 * SerializationWithInheritance.java:39)
	 */
	// we declaring parameter-argument JVM will throw above excpetion
//	public Animal1(int i) {
//		System.out.println("Animal class Constructors");
//	}
	
	public Animal1() {
		System.out.println("Animal class Constructors");
	}
}
