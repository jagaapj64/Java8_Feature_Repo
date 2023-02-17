package com.java8.features;

import java.util.ArrayList;
import java.util.List;

public class LamdaExpressionWithForEachLoop {

	public static void main(String[] args) {
		   List<String> list=new ArrayList<String>();  
	        list.add("ankit");  
	        list.add("mayank");  
	        list.add("irfan");  
	        list.add("jai");  
	        
	        list.forEach(ele-> System.out.println(ele)); 
	        //or list.forEach(System.out::println); using method reference in java 8
	        
	     
	          
	}

}
