package com.java.collection.features;

import java.util.Arrays;

public class MyArraysBinarySearch {

	public static void main(String[] args) {

		int[] a1= {4,50,33,18,10};
		System.out.println("Primitive Array before searching : ");
		for (int i : a1) {
			System.out.print(i+" ");
		}
		Arrays.sort(a1);
		System.out.println("\nPrimitive Array After searching : ");
		for (int i : a1) {
			System.out.print(i+" ");
		}
		System.out.println("\n"+Arrays.binarySearch(a1, 18));
		System.out.println(Arrays.binarySearch(a1, 11));
		
		String[] s= {"A","G","M","F"};
		System.out.println("Object Array Before sorting : ");
		for (String string : s) {
			System.out.print(string+" ");
		}
		System.out.println("\nObject Array After sorting : ");
		Arrays.sort(s);
		for (String string : s) {
			System.out.print(string+" ");
		}
		System.out.println("\n"+Arrays.binarySearch(s, "G"));
		System.out.println(Arrays.binarySearch(s, "D"));
		Arrays.sort(s, new MyComparatorString());
		System.out.println("Object Array After sorting using Comparator : ");
		for (String string : s) {
			System.out.print(string+" ");
		}
		System.out.println("\n"+Arrays.binarySearch(s, "G"));
		System.out.println(Arrays.binarySearch(s, "T"));
	}

}
