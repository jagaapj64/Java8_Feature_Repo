/*2.Write a program to insert StringBuffer object into TreeSet where sorting order is Alphabetical order?
*/
package com.java.collection.features;

import java.util.Comparator;

public class MyComparatorStringBuffer implements Comparator<StringBuffer> {
     // until StringBuffer class won't provide implementation but since 11 version to StringBuffer class implements to Comparator Interface
	@Override
	public int compare(StringBuffer s1, StringBuffer s2) {
		return s1.toString().compareTo(s2.toString());
	}

}
