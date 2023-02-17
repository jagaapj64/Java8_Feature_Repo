package com.java.io.features;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class MyPrintWriter {

	public static void main(String[] args) throws IOException {
        FileWriter fileWriter=new FileWriter("MyPrintWriter.txt");
        PrintWriter printWriter=new PrintWriter(fileWriter);
        printWriter.write(100);
        printWriter.println(100);
        printWriter.println(true);
        printWriter.println('c');
        printWriter.println("Jaga");
        printWriter.flush();
        printWriter.close();
	}

}
