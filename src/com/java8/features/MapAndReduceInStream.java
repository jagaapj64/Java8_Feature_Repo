package com.java8.features;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class MapAndReduceInStream {

	public static void main(String[] args) {

		List<Integer> numbers= Arrays.asList(2,2,56,10);
		
		int nums1= numbers.stream().mapToInt(i->i).sum();
		System.out.println(nums1);
		
		int nums2=numbers.stream().reduce(0, (a,b)->a+b);
		System.out.println(nums2);
		
	
		Optional<Integer> nums3=numbers.stream().reduce(Integer::sum);
		
		System.out.println(nums3.get());
		
		int nums4=numbers.stream().reduce(0, (a, b) -> a > b ? a : b);
		System.out.println("nums4 :"+nums4);
		
		int nums5=numbers.stream().reduce(Integer::max).get();
		System.out.println("nums5 :"+nums5);
		
		List<String> list=Arrays.asList("Java","Hibernate","Spring");
		
		String str = list.stream().reduce((word1, word2) -> word1.length() > word2.length() ? word1 : word2).get();
		System.out.println("max length String :"+str);
		
		List<Student> studentList=new BookDto().getStudentAll();
		
		Double maxMarks = studentList.stream()
				.filter(stu -> stu.getGrade().equalsIgnoreCase("A"))
				.map(stu -> stu.getMarks())
				.mapToDouble(i -> i)
				.average()
				.getAsDouble();
		
		System.out.println(maxMarks);
		
		Double sumMarks = studentList.stream()
				.filter(stu -> stu.getGrade().equalsIgnoreCase("A"))
				.map(stu -> stu.getMarks())
				.mapToDouble(i -> i)
				.sum();
	
		System.out.println(sumMarks);
	
	}

}
