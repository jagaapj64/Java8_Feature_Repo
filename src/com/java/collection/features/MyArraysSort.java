package com.java.collection.features;

import java.util.Arrays;

public class MyArraysSort {

	public static void main(String[] args) {


		int[] a= {34,56,3,78,23};
		System.out.println("Primitive Array before sorting : ");
		for (int i : a) {
			System.out.println(i);
		}
		Arrays.sort(a);
		System.out.println("Primitive Array After sorting : ");
		for (int i : a) {
			System.out.println(i);
		}
		String[] s= {"A","G","M","F"};
		System.out.println("Object Array Before sorting : ");
		for (String string : s) {
			System.out.println(string);
		}
		System.out.println("Object Array After sorting : ");
		Arrays.sort(s);
		for (String string : s) {
			System.out.println(string);
		}
		Arrays.sort(s, new MyComparatorString());
		System.out.println("Object Array After sorting using Comparator : ");
		for (String string : s) {
			System.out.println(string);
		}
		
		
	}

}
