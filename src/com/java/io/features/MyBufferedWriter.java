package com.java.io.features;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class MyBufferedWriter {

	public static void main(String[] args) throws IOException {
      FileWriter fileWriter=new FileWriter("MyBufferd.txt");
      BufferedWriter bufferedWriter=new BufferedWriter(fileWriter);
      bufferedWriter.write(100);
      bufferedWriter.newLine();  // To inserting new line character
      char[] chars= {'a','b','c'};
      bufferedWriter.write(chars);
      bufferedWriter.newLine();
      bufferedWriter.write("solutions");
      bufferedWriter.flush();
      bufferedWriter.close();
	}

}
