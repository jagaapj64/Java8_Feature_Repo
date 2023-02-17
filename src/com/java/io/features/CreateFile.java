package com.java.io.features;

import java.io.File;
import java.io.IOException;

public class CreateFile {

	public static void main(String[] args) throws IOException {
//		File will creating in current working directory
		File file=new File("FirstFile.txt");
        file.createNewFile();
		
		System.out.println("File create : "+file.exists());
		
		File file2=new File("FielDirectory");
		file2.mkdir();
		System.out.println("Directory create : "+file2.exists());
		
//		File file3=new File("FielDirectory","Demo.txt");
		File file3=new File(file2,"Demo.txt");
		file3.createNewFile();
		System.out.println("Directory and file create : "+file3.exists());
		
		File file4=new File(file2,"Demo1.txt");
		file4.createNewFile();
		System.out.println("Directory and file create : "+file4.exists());
		
		
		int count=0;
		File fileList=new File("E:\\junit_workspace\\Java8FeaturesApplication");
		
		String[] str=fileList.list();
		for (String string : str) {
			File f1=new File(fileList,string);
			if(f1.isFile()) {
			count++;
			System.out.println("To Display Files : "+string);
			}
			if(f1.isDirectory()) {
				count++;
				System.out.println("To Display Directories : "+string);
			}
		}
		System.out.println("count : "+count);
	}

	
	
}
