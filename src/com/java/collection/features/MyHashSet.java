package com.java.collection.features;

import java.util.HashSet;

public class MyHashSet {

	public static void main(String[] args) {

		/*
		 * 1.The underlying data structure is Hashtable. 
		 * 2.Duplicate objects are not allowed. 
		 * 3.Insertion order is not preserved and it is based on hashcode of object. 
		 * 4.null insertion is possible(only once). 
		 * 5.Heterogenous object are allowed. 
		 * 6.Implements Serializable and Cloneable but not RandomAccess Interface. 
		 * 7.HashSet is best choice is if our frequent operation is search operation. 
		 * Note:- In HashSet duplicate are not allowed if our trying to
		 * insert duplicate we won't get any compiletime and runtime exception is
		 * simpile it is return false
		 */		
		HashSet<Object> set=new HashSet<>();
		set.add("A");
		set.add(10);
		set.add("A");
		set.add(null);
		set.add("M");
		set.add(null);
		set.add('V');
		set.add(true);
		System.out.println(set);
	}

}
