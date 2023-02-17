package com.java.io.features;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class CustomizedSerialization {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// During default serialization there may be loss information because of transient keyword
		Accounts accounts = new Accounts();
		System.out.println("Before Serialization : "+accounts.getUserName()+" "+accounts.getPassword());
		FileOutputStream fosAccounts = new FileOutputStream("serialize2.ser"); // Serialization
		ObjectOutputStream oosAccounts = new ObjectOutputStream(fosAccounts);
		oosAccounts.writeObject(accounts);

		FileInputStream fisAccounts = new FileInputStream("serialize2.ser"); // Deserialization
		ObjectInputStream oisAccounts = new ObjectInputStream(fisAccounts);
		Accounts accountsData = (Accounts) oisAccounts.readObject();
		System.out.println("After Serialization : "+accountsData.getUserName()+" "+accountsData.getPassword());
		oosAccounts.close();
		oisAccounts.close();
		// output guru@gmail.com null}

}
}