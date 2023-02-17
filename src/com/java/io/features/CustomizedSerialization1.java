package com.java.io.features;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class CustomizedSerialization1 {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// During default serialization there may be loss information because of transient keyword
		Accounts1 accounts1 = new Accounts1();
		System.out.println("Before Serialization : "+accounts1.getUserName()+" "+accounts1.getPassword());
		FileOutputStream fosAccounts = new FileOutputStream("serialize2.ser"); // Serialization
		ObjectOutputStream oosAccounts = new ObjectOutputStream(fosAccounts);
		oosAccounts.writeObject(accounts1);

		FileInputStream fisAccounts = new FileInputStream("serialize2.ser"); // Deserialization
		ObjectInputStream oisAccounts = new ObjectInputStream(fisAccounts);
		Accounts1 accountsData1 = (Accounts1) oisAccounts.readObject();
		System.out.println("After Serialization : "+accountsData1.getUserName()+" "+accountsData1.getPassword()+" "+accountsData1.getPin());
		oosAccounts.close();
		oisAccounts.close();
		// output guru@gmail.com null}

}

}
