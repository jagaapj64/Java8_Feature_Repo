/*1.Write a program to insert String object into TreeSet where all elements should be inserted into according to Reverse of Alphabetical order?
*/
package com.java.collection.features;

import java.util.Comparator;

public class MyComparatorInteger implements Comparator<Integer> {

	@Override
	public int compare(Integer I1, Integer I2) {
		if (I1 < I2)
			return +1;
		else if (I1 > I2)
			return -1;
		else
			return 0;
//		return I1.compareTo(I2);   default natural sorting order [0, 5, 10, 15, 20]
//		return - I1.compareTo(I2); Descending order [20, 15, 10, 5, 0]
//		return I2.compareTo(I1);   Descending order [20, 15, 10, 5, 0]
//		return - I2.compareTo(I1); Ascending order [0, 5, 10, 15, 20]
//		return +1;                 insertion order [10, 0, 15, 5, 20, 20]
//		return -1;                 Reverse of Insertion order [20, 20, 5, 15, 0, 10]
//		return -0;                 only first element will be inserted remaining all duplicate [10]


	}
		

}
