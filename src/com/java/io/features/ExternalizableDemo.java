package com.java.io.features;

import java.io.Externalizable;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

public class ExternalizableDemo implements Externalizable {

	/*
	 * Note:- In serailaization transient will play role but in Externalization
	 * transient keyword won't play any role because there is no use of transient
	 * keyword because programmer only saving the data choosing.
	 * 
	 * transient String s; transient int i; transient int j;
	 */

	String s;
	int i;
	int j;

	public String getS() {
		return s;
	}

	public void setS(String s) {
		this.s = s;
	}

	public int getI() {
		return i;
	}

	public void setI(int i) {
		this.i = i;
	}

	public int getJ() {
		return j;
	}

	public void setJ(int j) {
		this.j = j;
	}

	public ExternalizableDemo() {
		System.out.println("ExternalizableDemo Class Constructors ");
	}

	public ExternalizableDemo(String s, int i, int j) {
		this.s = s;
		this.i = i;
		this.j = j;
	}

	public void writeExternal(ObjectOutput out) throws IOException {
		out.writeObject(s);
		out.writeInt(i);
	}

	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		s = (String) in.readObject();
		i = in.readInt();

	}

	/*
	 * 1. If the class implements serializable then total object will be saved to
	 * file in this case output is Jaga..10..20 2. If the class implements
	 * Externalizable then only required variable will be saved to file in this case
	 * output is Jaga..10..0
	 */
	public static void main(String[] args) throws IOException, ClassNotFoundException {

		// During default serialization there may be loss information because of
		// transient keyword
		ExternalizableDemo external = new ExternalizableDemo("Jaga", 10, 100);
		System.out.println("Before Serialization : " + external.getS() + " " + external.getI() + " " + external.getJ());
		FileOutputStream fosAccounts = new FileOutputStream("serialize4.ser"); // Serialization
		ObjectOutputStream oosAccounts = new ObjectOutputStream(fosAccounts);
		oosAccounts.writeObject(external);

		FileInputStream fisAccounts = new FileInputStream("serialize4.ser"); // Deserialization
		ObjectInputStream oisAccounts = new ObjectInputStream(fisAccounts);
		ExternalizableDemo external2 = (ExternalizableDemo) oisAccounts.readObject();
		System.out
				.println("After Serialization : " + external2.getS() + " " + external2.getI() + " " + external2.getJ());
		oosAccounts.close();
		oisAccounts.close();
		// output guru@gmail.com null}

	}

}
