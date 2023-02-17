package com.java.collection.features;

import java.util.Enumeration;
import java.util.Stack;
import java.util.Vector;

public class MyVector {

	public static void main(String[] args) {
		
		
		/*
	  * 1. The underlying data structures is growable or re-sizeable array.
		2. Insertion order is preserved.
		3. Duplicates are allowed.
		4. Heterogenous object are allowed.
		5. null insertion is posssible.
		6. It implements Serializable,Cloneable,RandomAccess
		7. Every methods in present in the vector is synchronized and it is thread is safe.
		*/
		
		/*
		 * Constructors:- 1.Vector v=new Vector(); creates an empty Vector
		 * object with default capacity and once it reached match capacity and new
		 * Vector is created with New Capacity=CurrentCapacity*2; 2.Vector v=new
		 * Vector(int initailCapacity); creates an empty Vector object with specified
		 * capacity. 3.Vector v=new Vector(int initalCapacity,int increamentalCapacity);
		 * 4.Vector v=new Vector(Collection c); creates an equvalent object for the
		 * given collection this constructors meant for inter convertion bewteen
		 * collection.
		 */
		
      Vector<Integer> v=new Vector<Integer>();
      for (int i = 1; i <=10; i++) {
		v.addElement(i);
		
	}
      System.out.println("initial capacity : "+v.capacity());
//      v.addElement("a");
      System.out.println("adding capacity : "+v.capacity());
      System.out.println("elements : "+v);
      
      
		/*
		 * Stack(Class):-
		 *   It is child of class Vector. 
		 *   It is specially designed by class for last-in-first-out order
		 */
       
		/*
		 * Constructors:-
		 * Stack s=new Stack();
		 */
		/*
		 * Methods:-
		 * Object push(Object o); --> To insert an object into stack
		 * Object pop(); --> to remove and return top of the stack 
		 * Object peek(); --> to return top of the stack without removal 
		 * boolean empty() --> return true if stack is empty 
		 * int search(Object o); --> returns true if the elements is available otherwise return -1
		 */
    		   
      Stack<Object> s=new Stack<>();
      s.push("A");
      s.push("Z");
      s.push("V");
      System.out.println("Stack : "+s);
      System.out.println(s.search("Z"));
      System.out.println(s.search("k"));
      
      Enumeration<Integer> e=v.elements();
      while (e.hasMoreElements()) {
    	 Integer num=(Integer) e.nextElement();
    	 if(num%2==0) {
    		 System.out.println(num);
    	 }
		
	}
      System.out.println(v);
	}

}
