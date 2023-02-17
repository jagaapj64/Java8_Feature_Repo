package com.java.io.features;

import java.io.FileWriter;
import java.io.IOException;

public class FileWrite {

	public static void main(String[] args) throws IOException {
	FileWriter fileWrite=new FileWriter("MyFileWriter.txt"); 
//	FileWriter fileWrite=new FileWriter("MyFileWriter.txt",true); append file writer
	fileWrite.write(100);
	fileWrite.write("urga\nsoftwaresolution");
	fileWrite.write("\n");
    char[] ch= {'a','b','c'};
    fileWrite.write(ch);
   
    fileWrite.flush();
    fileWrite.close();
    
   

	}

}
