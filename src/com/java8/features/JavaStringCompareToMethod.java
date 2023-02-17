package com.java8.features;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class JavaStringCompareToMethod implements Comparator<Product>  {

	public static void main(String[] args) {
		   
        List<Product> list1=new ArrayList<Product>();  
          
        //Adding Products  
        list1.add(new Product(1,"HP Laptop",25000f)); 
        list1.add(new Product(3,"Keyboard",300f));     
        list1.add(new Product(2,"Dell Mouse",150f));  
        // K for 107 and D for 100 and H for 72

        
        System.out.println("Sorting on basis of name");
        
        Collections.sort(list1, (p1,p2)->{
        	 return p1.getName().compareTo(p2.getName());  
        });
        
        for (Product product : list1) {
			System.out.println("Product :"+product.getId()+" "+product.getName()+" "+product.getPrice());
		}
 
		/*
		 * It compares strings on the basis of the Unicode value of each character in
		 * the strings. If the first string is lexicographically greater than the second
		 * string, it returns a positive number (difference of character value). If the
		 * first string is less than the second string lexicographically, it returns a
		 * negative number, and if the first string is lexicographically equal to the
		 * second string, it returns 0.
		 */
        String s1="hello";  
        String s2="hello";  
        String s3="meklo";  
        String s4="hemlo";  
        String s5="flag";  
        
        List<String> list2=new ArrayList<String>();  
        list2.add(s1);
        list2.add(s2);
        list2.add(s3);
        list2.add(s4);
        list2.add(s5);
        Collections.sort(list2);
        list2.forEach(System.out::println);
        System.out.println(s2 +" -> "+s1.compareTo(s2));//0 because both are equal  
        System.out.println(s3 +" -> "+s1.compareTo(s3));//-5 because "h" is 5 times lower than "m"  
        System.out.println(s4 +" -> "+s1.compareTo(s4));//-1 because "l" is 1 times lower than "m"  
        System.out.println(s5 +" -> "+s1.compareTo(s5));//2 because "h" is 2 times greater than "f"  

        
		/*
		 * When we compare two strings in which either first or second string is empty,
		 * the method returns the length of the string. So, there may be two scenarios:
		 * 
		 * If first string is an empty string, the method returns a negative If second
		 * string is an empty string, the method returns a positive number that is the
		 * length of the first string.
		 */
        String str1="hello";
        String str2="";
        String str3="me";
        
        System.out.println(str1+" "+str1.compareTo(str2));
        System.out.println(str2+" "+str2.compareTo(str3));
        
        Collections.sort(Arrays.asList(str1,str2));
        
        
     // input string in uppercase  
        String st1 = new String("INDIA IS ");  
          
        // input string in lowercase  
        String st2 = new String("india is ");  
          
        System.out.println(st1.compareTo(st2));  
        
        Product product1=new Product(7, "Saravan",100);
        Product product2=new Product(8, "Saras",200);
      
      List<Product> listCompare=new ArrayList<Product>();  
      listCompare.add(product1);
      listCompare.add(product2);
      JavaStringCompareToMethod javaStringCompareToMethod=new JavaStringCompareToMethod();
		listCompare.stream().sorted((p1, p2) -> javaStringCompareToMethod.compare(product1, product2))
				.forEach(pro -> System.out.println(pro.getName())); 
		/*
		 * instead we declare lambda expression we use MethodReference(::) we
		 * referring compare method in JavaStringCompareToMethod class to Comparator
		 * interface
		 */		listCompare.stream().sorted(javaStringCompareToMethod::compare)
				.forEach(pro -> System.out.println(pro.getName()));
        
	}

	
	@Override
	public int compare(Product p1, Product p2) {
		return p1.getName().compareTo(p2.getName());
	}
	
}

