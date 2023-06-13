package com.java8.features;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerDemo {

	public static void main(String[] args) {
		Consumer<Integer> con = t -> System.out.println("printing : " + t);
		 con.accept(10);

		List<Integer> list = Arrays.asList(1, 3, 4, 5, 6);
		list.forEach(t -> System.out.println("printing : " + t)); // ---> using lambda expression
	}
}
