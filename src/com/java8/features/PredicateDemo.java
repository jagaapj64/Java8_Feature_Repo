package com.java8.features;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateDemo {

	public static void main(String[] args) {
		Predicate<Integer> predicate = t -> t % 2 == 0;
		System.out.println(predicate.test(5));
		
		List<Integer> list = Arrays.asList(1, 3, 4, 5, 6);
		list.stream().filter(t -> t % 2 == 0).forEach(t -> System.out.println("printing even : " + t)); // ---> using lambda expression
	}

}
