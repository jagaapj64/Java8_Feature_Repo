package com.java.io.features;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class MyFileReader {

	public static void main(String[] args) throws IOException {
		    File file=new File("MyFileWriter.txt");
		 FileReader fileReader=new FileReader(file);
		    
		    char[] chars=new char[(int) file.length()];
		    fileReader.read(chars);
		    for (char c : chars) {
				System.out.print(c);
			}
		    System.out.println("\n>>>>>>>>>>>>");
		    FileReader fileReader2=new FileReader(file);
		   int i= fileReader2.read();
		   while (i!=-1) {
			System.out.print((char)i);
			i=fileReader2.read();
		}
		   fileReader2.close();
		    fileReader.close();
	}

}
