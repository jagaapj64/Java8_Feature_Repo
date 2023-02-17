package com.java.collection.features;

import java.util.TreeSet;

public class MyTreeSet {

	public static void main(String[] args) {

//		 1.The underlying data structures is BalancedTree.
//		 2.Duplicate object are not allowed.
//		 3.Insertion order not preserved.
//		 4.Heterogenous object are not allowed. otherwise we will get ClassCastException
//		 5.null insertion is possible(only once)
//		 6.TreeSet implements Serailizable and Cloneable but not RandomAccess.
//		 7.All object will be inserted based on some sorting order it may be default sorting order or customized sorting order.
		 
		TreeSet<String> tset=new TreeSet<String>();
		tset.add("A");
		tset.add("a");
		tset.add("B");
		tset.add("C");
		System.out.println(tset); // [A, B, C, a]
//		tset.add(new Integer(10)); 
//		tset.add(null);
//		tset.add("c");
		System.out.println(tset);  // we will get ClassCastException
		
		TreeSet<String> tset2=new TreeSet<String>();
//		tset2.add(null);
		System.out.println(tset2); 
		/*
		 * tset2 --> until 1.6v is allowed as the first element to empty TreeSet but from 1.7v
		 * null is not allowed even as the first element that is null is such type of
		 * story not applicable for TreeSet from 1.7v
		 */
	}

}
