package com.java.io.features;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Accounts implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 8166134750110316943L;
	private String userName="guru@gmail.com";
	transient String password="Guru";
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
	}
	
	private void readObject(ObjectInputStream ois) throws ClassNotFoundException, IOException {
		ois.defaultReadObject();
		String encryptPwd=(String) ois.readObject();
		password=encryptPwd.substring(3);
	}
}
