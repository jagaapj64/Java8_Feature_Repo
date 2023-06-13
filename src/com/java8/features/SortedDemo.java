package com.java8.features;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortedDemo {

	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(1,45,56,23);
		
//		Collections.sort(list);
//		list.forEach(System.out::println);
//		System.out.println();
//		Collections.reverse(list);
//		list.forEach(System.out::println);
//		
//		System.out.println();
//		list.stream().sorted().forEach(System.out::println);
//		System.out.println();
//		list.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
		
		List<Book> bookList=new BookDto().getBooksSign();
		
		
		Collections.sort(bookList,new BookComparators());
		bookList.forEach(System.out::println);
		
		Collections.sort(bookList, new Comparator<Book>() {

			@Override
			public int compare(Book o1, Book o2) {

				return (int) (o2.getPrice() - o1.getPrice());
			}
		});
		bookList.forEach(System.out::println);
		
		Collections.sort(bookList, (o1, o2) -> (int) (o2.getPrice() - o1.getPrice()));
		bookList.forEach(System.out::println);
		 
		bookList.stream().sorted((o1, o2) -> (int) (o2.getPrice() - o1.getPrice())).forEach(System.out::println);
		
		bookList.stream().sorted(Comparator.comparingDouble(e->((Book) e).getPrice()).reversed()).forEach(System.out::println);
		
		bookList.stream().sorted(Comparator.comparing(Book::getBookName).reversed()).forEach(System.out::println);
		
			
		
	}
}

class BookComparators implements Comparator<Book>{

	@Override
	public int compare(Book o1, Book o2) {
		int res=(int) (o2.getPrice()-o1.getPrice());
		return res;
	}
	
}

