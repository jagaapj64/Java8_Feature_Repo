package com.java.collection.features;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class MyLinkedHashMap {

	public static void main(String[] args) {

		LinkedHashMap<Object, Object> map=new LinkedHashMap<>();
		map.put("Guru", 1000);
		map.put("Thiru", 180);
		map.put("Mani", 800);
		map.put("Jhon", 500);
		System.out.println(map);
		map.put("Mani", 900);
		System.out.println(map);
		Collection<Object> c=map.values();
		System.out.println("values : "+c);
		Set<Object> s=map.keySet();
		System.out.println("keys : "+s);
		
		Set set=map.entrySet();
		Iterator<Object> itr=set.iterator();
		while (itr.hasNext()) {
			Map.Entry<Object, Object> object = (Map.Entry) itr.next();
			System.out.println(object.getKey()+"="+object.getValue());
			if(object.getKey().equals("Guru")) {
				object.setValue(1);
			}
			
		}
		System.out.println(map);
	}

}
