package com.java.collection.features;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class MyProperties {

	public static void main(String[] args) throws IOException {

//		 1.In our program if anythink which changes frequently (like username,password,mobilenum etc.,) are not reccomanded to hard code in java program
//		   because if there is any change to reflect that change recompilation,rebuild,redeploy application is required even some times server restart also required
//		 which create big bussiness impace to the client.
//		  2.We can overcome this problem by using properties file such type variable we have to configure in the properties file from the properties file 
//		 we have to read into java program and we can use those properties.
//		  3.The main advantage of this approach is if there is change in properties file to reflect that changes just redeployment in enough which wo'nt create any
//		 impact to client. 
//		  4.We can use java properties object to hold properties which are comming from properties file.
//		  5.In normal Map(HashMap,TreeMap) key and value is any type but in the case of propeties key and value should be String type.
		  
		Properties properties=new Properties();
		FileInputStream fis=new FileInputStream("inputProperties.txt");
		properties.load(fis);
		System.out.println(properties);
	 	String name=properties.getProperty("username");
	 	System.out.println(name);
	 	properties.setProperty("password", "guru@321");
	 	FileOutputStream fos=new FileOutputStream("inputProperties.txt");
	 	properties.store(fos, "Updated with new password");
	 	System.out.println(properties);
//	 	Connection con=DriverManager.getConnection(url, username, password);
	}

}
