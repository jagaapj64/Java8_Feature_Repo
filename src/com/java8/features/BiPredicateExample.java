package com.java8.features;

import java.util.function.BiPredicate;

public class BiPredicateExample {

	public static void main(String[] args) {

		BiPredicate<String, String> biPredicate = new BiPredicate<String, String>() {

			@Override
			public boolean test(String t, String u) {

				return t.equals(u);
			}
		};
		boolean res = biPredicate.test("madam", "madam");
		System.out.println(res);

		BiPredicate<String, String> biPredicate2 = (t, u) -> t.equals(u);
		
		BiPredicate<String, String> lengthBiPredicate=(t,u)->t.length()==u.length();
		
		
		System.out.println("andOutput : "+biPredicate2.and(lengthBiPredicate).test("madam", "madam"));
		
		System.out.println("orOutput : "+biPredicate2.or(lengthBiPredicate).test("abc", "edf"));

	}
}
