package com.java.io.features;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class MergeTwoFilesIntoFile {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException {

//		Write Program to merge two file into third file?
     PrintWriter printWriter1=new PrintWriter("MergeTwoFile.txt");
     BufferedReader br=new BufferedReader(new FileReader("MyFileWriter.txt"));
     String line=br.readLine();
     
     while (line!=null) {
		printWriter1.println(line);
		line=br.readLine();
	}
     br=new BufferedReader(new FileReader("MyPrintWriter.txt"));
     line=br.readLine();
     while (line!=null) {
 		printWriter1.println(line);
 		line=br.readLine();
 	}
     printWriter1.flush();
     br.close();
     printWriter1.close();
		
//		Write program file merge operation where merging should be line by line alternativly
		 PrintWriter printWriter=new PrintWriter("MergeTwoFile2.txt");
	     BufferedReader br1=new BufferedReader(new FileReader("MyFileWriter.txt"));
	     BufferedReader br2=new BufferedReader(new FileReader("MyPrintWriter.txt"));
	     String line1=br1.readLine();
	     String line2=br2.readLine();
	     
			while (line1 != null || line2 != null) {
				if(line1 != null) {
				printWriter.println(line1);
				line1 = br1.readLine();
				}
				if(line2 != null) {
				printWriter.println(line2);
				line2 = br2.readLine();
				}
			}
			br1.close();
			br2.close();
	     printWriter.flush();
	     printWriter.close();
	}

}
