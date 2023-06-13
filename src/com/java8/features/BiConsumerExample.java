package com.java8.features;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class BiConsumerExample implements BiConsumer<String, Integer> {

	@Override
	public void accept(String t, Integer u) {

		System.out.println(t+" : "+u);
	}
	public static void main(String[] args) {
		BiConsumer<String, Integer> biConsumer=new BiConsumerExample();
		biConsumer.accept("JavaScript", 1000);
		
		BiConsumer<String, Integer> biConsumer2=new BiConsumer<String, Integer>() {

			@Override
			public void accept(String t, Integer u) {
				System.out.println("key : " + t + " -> val : " + u);

			}
		};
		biConsumer2.accept("ReactJs", 50000);
		
		BiConsumer<String, Integer> biConsumer3=(key,val)-> System.out.println("key : " + key + " = val : " + val);
		biConsumer3.accept("Java", 10000);
		
		Map<String, Integer> map=new HashMap<>();
		map.put("FaceBook", 20000);
		map.put("YouTube", 35000);
		map.put("Google", 42000);
		System.out.println();
		map.forEach((k,v)-> System.out.println(k+" -----> "+v));
		
	}

}
