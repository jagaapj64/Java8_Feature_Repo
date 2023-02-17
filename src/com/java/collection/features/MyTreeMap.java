package com.java.collection.features;

import java.util.TreeMap;

public class MyTreeMap {

	public static void main(String[] args) {

		TreeMap<Object, Object> map=new TreeMap<>();
		map.put(101, "AAA");
		map.put(104, "BBB");
		map.put(105, "NNN");
//		map.put("EF", "NNN"); CCE
//		map.put(null, "MMM"); NPE
		System.out.println(map);
		
		TreeMap<Object, Object> map2=new TreeMap<>(new MyTreeMapComparator());
		map2.put("AAA",10);
		map2.put("BBB",103);
		map2.put("NNN",106);
		System.out.println(map2);

	}

}
