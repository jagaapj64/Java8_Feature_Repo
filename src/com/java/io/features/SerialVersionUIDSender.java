package com.java.io.features;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerialVersionUIDSender {

	public static void main(String[] args) throws IOException {
	Person person = new Person();
	FileOutputStream fos = new FileOutputStream("serialize5.ser"); // Serialization
	ObjectOutputStream oos = new ObjectOutputStream(fos);
	oos.writeObject(person);
	System.out.println("Serialization is done");
	oos.close();
}

}
