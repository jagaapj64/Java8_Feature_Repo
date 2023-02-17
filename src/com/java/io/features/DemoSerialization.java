package com.java.io.features;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class DemoSerialization {

	
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Employee employee=new Employee();
		FileOutputStream fos=new FileOutputStream("serialize.ser");  // Serialization
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(employee);
		
		FileInputStream fileInputStream=new FileInputStream("serialize.ser"); // Deserialization
		ObjectInputStream ois=new ObjectInputStream(fileInputStream);
		Employee emp=(Employee) ois.readObject();
		oos.close();
		ois.close();
		 System.out.print(emp.getAge()+" "+emp.getName());

	}

}
