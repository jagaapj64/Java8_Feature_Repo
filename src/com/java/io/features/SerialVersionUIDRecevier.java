package com.java.io.features;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class SerialVersionUIDRecevier {

	/*
	 * Exception in thread "main" java.io.InvalidClassException:
	 * com.java.io.features.Person; local class incompatible: stream classdesc
	 * serialVersionUID = -8178697621553017670, local class serialVersionUID =
	 * -8254441525026925213 at
	 * java.base/java.io.ObjectStreamClass.initNonProxy(ObjectStreamClass.java:597)
	 * at
	 * java.base/java.io.ObjectInputStream.readNonProxyDesc(ObjectInputStream.java:
	 * 2051) at
	 * java.base/java.io.ObjectInputStream.readClassDesc(ObjectInputStream.java:
	 * 1898) at
	 * java.base/java.io.ObjectInputStream.readOrdinaryObject(ObjectInputStream.java
	 * :2224) at
	 * java.base/java.io.ObjectInputStream.readObject0(ObjectInputStream.java:1733)
	 * at java.base/java.io.ObjectInputStream.readObject(ObjectInputStream.java:509)
	 * at java.base/java.io.ObjectInputStream.readObject(ObjectInputStream.java:467)
	 * at
	 * com.java.io.features.SerialVersionUIDRecevier.main(SerialVersionUIDRecevier.
	 * java:12)
	 */
	public static void main(String[] args) throws ClassNotFoundException, IOException {
		FileInputStream fileInputStream = new FileInputStream("serialize5.ser"); // Deserialization
		ObjectInputStream ois = new ObjectInputStream(fileInputStream);
		Person emp = (Person) ois.readObject();
		System.out.println(emp.getName()+" "+emp.getAge());
		System.out.println("Deserialization is done");
		ois.close();
		}

}
