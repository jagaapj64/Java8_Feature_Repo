package com.java8.features;

public class LamdaExpressionWithParams {

	public static void main(String[] args) {
		 // Lambda expression with Parameter and with return keyword.  
		Arithmetic ar2=(a,b)->{
			return (a+b);
		};
		System.out.println(ar2.add(34, 16));
		 
		// Lambda expression with Parameter and without return keyword.  
		Arithmetic ar3=(a,b)-> (a+b);
        System.out.println(ar3.add(34, 16));
        
     
        
      // K for 107 and D for 100 and H for 72
       
	}

}
