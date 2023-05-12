package com.java8.features;

public class SayableMethodRefImpl {

	// static methods 
		public static void saySomethingStatic() {
			System.out.println("Hello this is static method reference");
		}
		
	    public static void ThreadStatusStatic(){  
	        System.out.println("Hello this is static Thread is running...");  
	    }  
	    
	    public void saySomethingNonStatic() {
			System.out.println("Hello this is non-static method reference");
		}
	    
	    
	    public void ThreadStatusNonStatic(){  
	        System.out.println("Hello this non-static method Thread is running...");  
	    }  
	    
}
