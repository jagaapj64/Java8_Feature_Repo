package com.java.io.features;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileExtraction {

	public static void main(String[] args) throws IOException {
		PrintWriter printWriter=new PrintWriter(new FileWriter("FileExtrac.txt"));
		 BufferedReader br1=new BufferedReader(new FileReader("input.txt"));
	     String line=br1.readLine();
	     while (line!=null) {
	    	 boolean availabe=false;
	    	 BufferedReader br2=new BufferedReader(new FileReader("delete.txt"));
	    	 String target=br2.readLine();
	    	 while (target!=null) {
				if(line.equals(target)) {
					availabe=true;
				}
				target=br2.readLine();
			}
	    	 if(availabe==false) {
	    		 printWriter.println(line);
	    	 }
	    	 line=br1.readLine();
		}
	     br1.close();
	     printWriter.close();

	}
	

}
