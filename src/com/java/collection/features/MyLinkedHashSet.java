package com.java.collection.features;

import java.util.LinkedList;

public class MyLinkedHashSet {

	public static void main(String[] args) {

		/*
		 * It is child class of HashSet It is exactly same as HashSet(cons,methods) excpet the following difference
		 * 
		 * 1.The underlying data structures hashtable 
		 *   The underlying data structures as combination of LinkedList and Hashtables.
		 * 2.Insertion order not preserved.
		 *   Insertion order preserved. 
		 * 3.Indroduced in 1.2v 
		 *   Indroduced in 1.4v
		 */
		LinkedList<Object> set=new LinkedList<>();
		set.add("A");
		set.add(10);
		set.add("A");
		set.add(null);
		set.add("M");
		set.add(null);
		set.add('V');
		set.add(true);
		System.out.println(set);
		
		/*
		 * In general we use LinkedHashSet to develop cache based application where
		 * duplicates are not allowed and insertion order is preserved.
		 */	}

}
