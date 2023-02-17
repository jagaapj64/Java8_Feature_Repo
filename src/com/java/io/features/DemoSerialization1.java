package com.java.io.features;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class DemoSerialization1 {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Employee1 employee1 = new Employee1();
		FileOutputStream fos = new FileOutputStream("serialize1.ser"); // Serialization
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(employee1);

		FileInputStream fileInputStream = new FileInputStream("serialize1.ser"); // Deserialization
		ObjectInputStream ois = new ObjectInputStream(fileInputStream);
		Employee1 emp = (Employee1) ois.readObject();
		oos.close();
		ois.close();
		System.out.print(emp.getDepartment().getEmployeeBranch().getBranch());
		System.out.println();

	}

}
