package com.java.collection.features;

import java.util.Hashtable;

public class MyHashTable {

	public static void main(String[] args) {

//		1.The underlying data structures is Hashtable.
//		2.Insertion order is not preserved and it based on hashcode of keys.
//		3.Duplicate keys are not allowed and values can be duplicate.
//		4.Heterogeneous object are allowed for both keys and values.
//		5.null is not allowed for both keys and values otherwise we will get RE saying NPE.
//		6.It implements Serializable and Cloneable but not RandomAccess interface.
//		7.Every methods present in Hashtable is sychronized and hence Hashtable object is thread is safe.
//		8.Hashtable is best choice is if our operation search operation.
		
		Hashtable<Object, Object> table=new Hashtable<>(25);
		table.put(new Temp1(5), "A");
		table.put(new Temp1(2), "B");
		table.put(new Temp1(6), "C"); // sorting based on the From Top to Bottom  and Right to Left 
		table.put(new Temp1(15), "D"); // 15%11=4
		table.put(new Temp1(23), "E"); // 23%11=1
		table.put(new Temp1(16), "F"); // 16%11=5
//		table.put("Jaga", null);
	
		System.out.println(table); // {23=E, 6=C, 16=F, 5=A, 15=D, 2=B}
	}

}
