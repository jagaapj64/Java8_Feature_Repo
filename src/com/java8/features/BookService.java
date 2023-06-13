package com.java8.features;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import org.apache.commons.lang3.StringUtils;


public class BookService {

	public List<Book> getBookSort(){
		List<Book> bookDto=new BookDto().getBooksSign();
		Collections.sort(bookDto, (o1, o2) -> o2.getBookName().compareTo(o1.getBookName())

		);
		return bookDto;
	}
	
	public List<Book> getBookSortStartWith(){
		List<Book> bookDto=new BookDto().getBooksSign();
		List<Book> start=bookDto.stream().filter(text -> StringUtils.startsWithIgnoreCase(text.getBookName(), "j"))
				.collect(Collectors.toCollection(ArrayList::new));
		
		
		
		return start;
	}
	
	
	
	public static void main(String[] args) {
//		System.out.println(new BookService().getBookSort());
		System.out.println(new BookService().getBookSortStartWith());
	}

}

class MyComparator implements Comparator<Book>{

	@Override
	public int compare(Book o1, Book o2) {
		
		return o2.getBookName().compareTo(o2.getBookName());
	}
	
}
