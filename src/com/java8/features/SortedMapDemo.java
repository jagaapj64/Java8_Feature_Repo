package com.java8.features;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class SortedMapDemo {

	public static void main(String[] args) {

		Map<String, Integer> map = new HashMap<>();
		map.put("Java", 10);
		map.put("Golang", 100);
		map.put("React", 560);
		map.put("JavaScript", 320);

		List<Entry<String, Integer>> list = new ArrayList<>(map.entrySet());

		Collections.sort(list, (o1, o2) -> o1.getKey().compareTo(o2.getKey()));
//		list.forEach(System.out::println);
		System.out.println();
//		map.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);
		System.out.println();
//		map.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);
		
		Map<Book, Integer> bookMap = new TreeMap<>((o1, o2) -> (int) (o2.getPrice() - o1.getPrice()));
		bookMap.put(new Book(10,"Java",2000),100);
		bookMap.put(new Book(20,"python",4500),800);
		bookMap.put(new Book(30,"goLang",6000),700);
		bookMap.put(new Book(40,"JavaScript",8000),600);
//		System.out.println(bookMap);
		
		bookMap.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.comparing(Book::getPrice).reversed()))
				.forEach(System.out::println);
			
		
	}

}
