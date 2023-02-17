package com.java.io.features;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Accounts1 implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 3499539004068112932L;
	private String userName="guru@gmail.com";
	transient String password="Guru";
	public int getPin() {
		return pin;
	}
	public void setPin(int pin) {
		this.pin = pin;
	}

	transient int pin=1234;
	
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
//	Programmer can't call private methods directly from out of the class but jvm can call private methods from out of class
	private void writeObject(ObjectOutputStream oos) throws IOException {
		oos.defaultWriteObject();
		oos.writeObject("123"+password);
		oos.writeInt(4444+pin);
	}
	
	private void readObject(ObjectInputStream ois) throws ClassNotFoundException, IOException {
		ois.defaultReadObject();
		String encryptPwd=(String) ois.readObject();
		password=encryptPwd.substring(3);
		int encryptPin=ois.readInt();
		pin=encryptPin-4444;
	}
}
