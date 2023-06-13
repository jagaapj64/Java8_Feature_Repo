package com.java8.features;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ExceptionHandlingMechanism {

	public static void main(String[] args) {

		List<String> list = Arrays.asList("34", "45", "xyz");
//		List<Integer> list1 = Arrays.asList(1,0);  // type cast problem
//		list.forEach(handleGenericException(s -> System.out.println(Integer.parseInt(s)), NumberFormatException.class));

		List<Integer> list1 = Arrays.asList(1, 0);
//		list1.forEach(handleGenericException(s -> System.out.println(10 / s), ArithmeticException.class));
		

		List<Integer> list2 = Arrays.asList(10,20);
		list2.forEach(handleCheckedExceptionConsumer(i -> {
            Thread.sleep(i);
			System.out.println(i);
         }));

	}

	public static void printList(String s) {
		try {
			System.out.println(Integer.parseInt(s));
		} catch (Exception e) {
			System.out.println("exception : " + e.getMessage());
		}
	}

	public static Consumer<String> handleIfAnyException(Consumer<String> payload) {
		return obj -> {
			try {
				payload.accept(obj);
			} catch (Exception e) {
				System.out.println("exception : " + e.getMessage());
			}
		};

	}

	// custom unchecked exception generic type
	static <Target, ExObj extends Exception> Consumer<Target> handleGenericException(Consumer<Target> targetConsumer,
			Class<ExObj> exObjClass) {
		return obj -> {
			try {
				targetConsumer.accept(obj);
			} catch (Exception e) {
				try {
					ExObj exObj = exObjClass.cast(e);
					System.out.println("exception : " + exObj.getMessage());
				} catch (ClassCastException cce) {
					throw cce;
				}

			}
		};

	}

	// custom checked exception generic type
	static <Target> Consumer<Target> handleCheckedExceptionConsumer(
			CheckedExceptionHandlerConsumer<Target, Exception> handlerConsumer) {
		return obj -> {
			try {
				handlerConsumer.accept(obj);
			} catch (Exception e) {
				new RuntimeException(e);
			}
		};

	}
}
