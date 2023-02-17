package com.java.collection.features;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.RandomAccess;

public class MyArrayList {

	public static void main(String[] args) {

			
		ArrayList<Object> l=new ArrayList<Object>();
		l.add("A");
		l.add(10);
		l.add('c');
		l.add(null);
		System.out.println(l);
		l.add(2, "U");
		System.out.println(l);
		ArrayList<Object> l2=new ArrayList<Object>();
		l2.add("Jaga");;
		l2.addAll(l);
		System.out.println(l2);
		l.clear();
		l2.clear();
		/*
		 * 1.Usually we use collection to hold and transfer object from one location to
		 * another location(containder) to provide support this requirement for every
		 * collection is by default implements serializable and cloneable interface.
		 */
		/*
		 * 2.ArrayList and Vector classes implements Random Access interface so that any
		 * Random element we can access with same speed.
		 */
		
		/*
		 * Random Access :-Random Access Interface present in java.util
		 * package and it is not any methods and it is marker interface.,where required
		 * ablilty we will be provide automatically by the JVM.
		 */
		ArrayList<Object> al=new ArrayList<Object>();
		LinkedList<Object> ll=new LinkedList<Object>();
		System.out.println(al instanceof Serializable);
		System.out.println(ll instanceof Cloneable);
		System.out.println(al instanceof RandomAccess);
		System.out.println(ll instanceof RandomAccess);
		al.clear();
		ll.clear();
		ll.stream().sorted();
		

		
		

	}

}
