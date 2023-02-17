package com.java.collection.features;

import java.util.LinkedList;

public class MyLinkedList {

	public static void main(String[] args) {
		
		/*
		 * 1.Underlying data structures is double linkedlist. 2.Insertion is order is
		 * preserved. 3.Duplicates objects are allowed. 4.Heterogenous objects are
		 * allowed. 5.null insertion is possible. 6.LinkdeList implements Serializable
		 * and Clonable Interface but not RandomAccess. 7.LinkdedList is best chioce is
		 * if our frequent operation is insertion or deletion in the middle.
		 * 8.LinkdedList is wors chioce is if our frequent operation is retrival
		 * operation.
		 */
		
		/*
		 * Constructors:-
		 * LindkedList l=new LinkedList(); create an emopty linkdelist object. 
		 * LinkdedList l=new LinkedList(Collection c); creates an equivalent linkedlist object for the given collection.
		 */
		 
		LinkedList<Object> linkdeList=new LinkedList<Object>();
		linkdeList.add("jaga");
		linkdeList.add(10);
		linkdeList.add(null);
		System.out.println("linkdeList 1 :"+linkdeList);
		linkdeList.set(0, "meeran");
		linkdeList.add("guru");
		System.out.println("linkdeList 2 :"+linkdeList);
		linkdeList.removeLast();
		System.out.println("linkdeList remove :"+linkdeList);
		linkdeList.add(0,"hari");
		System.out.println("linkdeList add :"+linkdeList);

	}

}
