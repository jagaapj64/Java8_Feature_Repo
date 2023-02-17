package com.java.collection.features;

import java.util.IdentityHashMap;

public class MyIdentityHashMap {

	public static void main(String[] args) {
		IdentityHashMap<Integer, String> map=new IdentityHashMap<Integer, String>();
		
		/*
		 * It is exactly same as HashMap(including methods,constructors) except the
		 * following difference In the case normal HashMap JVM will use .equals to
		 * Identify to duplicate key which is meant for content comparison But in the
		 * case of IdentityHashMap JVM will use .equals operator to identify to
		 * duplicate keys which is meant for difference comparison (address comparison).
		 */
		Integer I1=new Integer(10);
		Integer I2=new Integer(10);
		map.put(I1, "jaga");
		map.put(I2, "kalyan");
		System.out.println(map);
		}

}
