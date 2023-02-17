package com.java.io.features;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializationWithInheritance {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
        // Case1
		Lion lion1 = new Lion();
		System.out.println("Before Serialization : "+lion1.getI()+" "+lion1.getJ());
		FileOutputStream foslion1 = new FileOutputStream("serialize3.ser"); // Serialization
		ObjectOutputStream ooslion1 = new ObjectOutputStream(foslion1);
		ooslion1.writeObject(lion1);

		FileInputStream fislion1 = new FileInputStream("serialize3.ser"); // Deserialization
		ObjectInputStream oislion1 = new ObjectInputStream(fislion1);
		Lion lion2 = (Lion) oislion1.readObject();
		System.out.println("After Serialization : "+lion2.getI()+" "+lion2.getJ());
		ooslion1.close();
		oislion1.close();
		
		//output: 
//		Before Serialization : 10 20
//		After Serialization : 10 20

		// Case2
		Lion1 lion3 = new Lion1();
		System.out.println("Before Serialization : "+lion3.getI()+" "+lion3.getJ());
		FileOutputStream foslion2 = new FileOutputStream("serialize3.ser"); // Serialization
		ObjectOutputStream ooslion2 = new ObjectOutputStream(foslion2);
		ooslion2.writeObject(lion3);

		FileInputStream fislion2 = new FileInputStream("serialize3.ser"); // DeSerialization
		ObjectInputStream oislion2 = new ObjectInputStream(fislion2);
		Lion1 lion4 = (Lion1) oislion2.readObject();
		System.out.println("After Serialization : "+lion4.getI()+" "+lion4.getJ());
		ooslion2.close();
		oislion2.close();
		
		//output 
//		Animal class Constructors
//		Lion class Constructors
//		Before Serialization : 100 200
//		Animal class Constructors
//		After Serialization : 100 200
}

}
