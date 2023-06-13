package com.java8.features;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class SupplierDemo {

	// learn from JavaTechie
	public static void main(String[] args) {
		Supplier<String> supplier = () -> "Hi Java ";
		System.out.println(supplier.get());
		
		List<String> list=Arrays.asList();
		System.out.println(list.stream().findAny().orElseGet(() -> "Hi Java "));
	}

}
