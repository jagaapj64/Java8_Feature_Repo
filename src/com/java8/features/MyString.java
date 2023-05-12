package com.java8.features;

import java.util.StringJoiner;

public class MyString {

	public static void main(String[] args) {

		String s1 = "java";
		System.out.println("s1 : "+s1);
		String s2 = "java"; 
		if(s1==s2)
		System.out.println("s2 : "+s2);
		String s3=new String("java");
		s3=s3+" world";
		if(s1==s3) 
			System.out.println("s1==s3 : "+s3);
		
		else if (s1==s3)
		System.out.println("s1==s2 : "+s3);
		
		else
			System.out.println("s3 is creating new object : "+s3);
			
//		String s4=new String("Sachin");
		String s4="Sachin";
		s4.concat("Dendulkar");
		System.out.println("before assign : "+s4);
		s4=s4.concat("Dendulkar");
		System.out.println("after assign : "+s4);
		
		StringJoiner stringJoiner=new StringJoiner(",", "[", "]");
		stringJoiner.add("java");
		stringJoiner.add("spring");
		stringJoiner.add("python");
		System.out.println(stringJoiner);
	}

}
