package com.java.collection.features;

import java.util.TreeSet;

public class MyTreeSet2 {

	public static void main(String[] args) {

		TreeSet<StringBuffer> tset=new TreeSet<StringBuffer>();
		tset.add(new StringBuffer("A"));
		tset.add(new StringBuffer("Z"));
		tset.add(new StringBuffer("L"));
		tset.add(new StringBuffer("B"));
		System.out.println(tset);
		
		System.out.println("A".compareTo("Z"));
		System.out.println("Z".compareTo("K"));
		System.out.println("A".compareTo("A"));
//		System.out.println("A".compareTo(null)); we will get NPE
		
		
			/*
		 * If default natural sorting order are not available or if our not satisifed
		 * with default natural sorting order then we should go for customized sorting
		 * by using Comparator.
		 * 
		 * Comparable meant for Default natural sorting order where as Comparator meant
		 * for Customized sorting order.
		 */
		TreeSet<String> t=new TreeSet<String>();
		t.add("K");
		t.add("Z"); // "Z".compareTo("K") ---> +ve
		t.add("A"); // "A".compareTo("K") ---> -ve
		t.add("A"); // "A".compareTo("K") ---> -ve ---> "A".compareTo("A") ---> 0
		System.out.println(t);

		}

}
