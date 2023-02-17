package com.java.collection.features;

import java.util.TreeMap;
import java.util.TreeSet;

public class MyNavigableSet {

	public static void main(String[] args) {


		TreeSet<Integer> t1=new TreeSet<Integer>();
		t1.add(1000);
		t1.add(2000);
		t1.add(2001);
		t1.add(4000);
		t1.add(5000);
//		t1.add(999);
		System.out.println(t1);
		System.out.println("ceiling : "+t1.ceiling(999));
		System.out.println("higher : "+t1.higher(1999));
		System.out.println("lower : "+t1.lower(2000));
		System.out.println("pollFirst : "+t1.pollFirst());
		System.out.println("pollLast : "+t1.pollLast());
		System.out.println("floor : "+t1.floor(2003));
		System.out.println("descendingSet : "+t1.descendingSet());
		
		TreeMap<String, String> map=new TreeMap<String, String>();
		map.put("b", "arun");
		map.put("y", "jaga");
		map.put("s", "somu");
		map.put("a", "lorri");
		map.put("r", "smithh");
		System.out.println(map);
		System.out.println("ceiling : "+map.ceilingKey("e"));
		System.out.println("higherKey : "+map.higherKey("r"));
		System.out.println("floorKey : "+map.floorKey("t"));
		System.out.println("lowerKey : "+map.lowerKey("c"));
		System.out.println("pollFirstEntry : "+map.pollFirstEntry());
		System.out.println("pollLastEntry : "+map.pollLastEntry());
		System.out.println("descendingMap : "+map.descendingMap());
		System.out.println(map);
	}

}
