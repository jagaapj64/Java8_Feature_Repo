package com.java8.features;

import java.util.ArrayList;
import java.util.List;


public class BookDto {

	public List<Book> getBooksSign(){
		List<Book> list=new ArrayList<>();
		list.add(new Book(10,"Java",2000));
		list.add(new Book(20,"python",4500));
		list.add(new Book(30,"goLang",6000));
		list.add(new Book(40,"JavaScript",8000));
		return list;	
	} 
	
	public List<Student> getStudentAll(){
		List<Student> list=new ArrayList<>();
		list.add(new Student(10,"kathir","A",2000));
		list.add(new Student(20,"guru","C",5000));
		list.add(new Student(30,"yash","B",6000));
		list.add(new Student(40,"jhon","A",8000));
		return list;	
	}
}
