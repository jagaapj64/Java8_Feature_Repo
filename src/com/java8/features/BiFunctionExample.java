package com.java8.features;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class BiFunctionExample implements BiFunction<List<Integer>, List<Integer>, List<Integer>> {

	@Override
	public List<Integer> apply(List<Integer> list1, List<Integer> list2) {
		return Stream.of(list1, list2).flatMap(List::stream).distinct().collect(Collectors.toList());

	}

	public static void main(String[] args) {
		BiFunction<List<Integer>, List<Integer>, List<Integer>> biFunction=new BiFunctionExample();
		List<Integer> list1=Arrays.asList(1,45,3,6,1,8,30);
		List<Integer> list2=Arrays.asList(10,10,3,6,45,9,330,1);
		
		List<Integer>  result=biFunction.apply(list1, list2);
		System.out.println("Traditional Approach : "+result);
		
		BiFunction<List<Integer>, List<Integer>, List<Integer>> biFunction2 = new BiFunction<List<Integer>, List<Integer>, List<Integer>>() {

			@Override
			public List<Integer> apply(List<Integer> l1, List<Integer> l2) {
				return  Stream.of(l1, l2).flatMap(List::stream).distinct().collect(Collectors.toList());
			}
		};
		System.out.println("Anonymous Approach : "+biFunction2.apply(list1, list2));
		
		BiFunction<List<Integer>, List<Integer>, List<Integer>> biFunction3 =(l1, l2) -> {
			  return Stream.of(l1, l2).flatMap(List::stream).distinct().collect(Collectors.toList());
		}; 

		Function<List<Integer>, List<Integer>> sortedFunctionList = (lists) -> lists.
				                                                                stream()
				                                                                .sorted()
				                                                                .collect(Collectors.toList());
		
			
		System.out.println("LamdaExpression Approach : "+biFunction3.andThen(sortedFunctionList).apply(list1, list2));
		
		
		
		System.out.println();
		Map<String, Integer> map=new HashMap<>();
		map.put("Java", 20000);
		map.put("Python", 35000);
		map.put("JavaScript", 42000);
		
		BiFunction<String, Integer, Integer> mapBiFunction = new BiFunction<String, Integer, Integer>() {

			@Override
			public Integer apply(String key, Integer value) {
				return value + 1000;
			}
		};
		map.replaceAll(mapBiFunction);
		System.out.println("Traditional Approach : "+map);
		
		map.replaceAll((key, val) -> val + 2000);
		System.out.println("LamdaExpression Approach : "+map);
		
	}
}
