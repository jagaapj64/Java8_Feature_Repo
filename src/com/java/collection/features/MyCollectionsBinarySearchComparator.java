package com.java.collection.features;

import java.util.Comparator;

public class MyCollectionsBinarySearchComparator implements Comparator<Integer> {

	@Override
	public int compare(Integer I1, Integer I2) {
		return I2.compareTo(I1);
	}

}
