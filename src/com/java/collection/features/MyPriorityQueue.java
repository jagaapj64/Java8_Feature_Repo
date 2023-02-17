package com.java.collection.features;

import java.util.PriorityQueue;

public class MyPriorityQueue {

	public static void main(String[] args) {

//		 1.If we want to represent a group individual object priority to processing according to some priority then we should go for PriorityQueue.
//		 2.The Priority can be either default natural sorting order Customized sorting order defined by Comparator.
//		 3.Insertion order is not preserved and it is based on some priority.
//		 4.Duplicate object are not allowed.
//		 5.If we are depending default sorting order compulsory Homogeneous and Comparable otherwise we will get RE saying CCE.
//		 6.If we are defining our own sorting by Comparator then object need not be Homogeneous and Comparable.
//		 7.null is not allowed even as the first element alos.
		
		PriorityQueue<Object> q=new PriorityQueue<Object>();
		System.out.println(q.peek()); // null
//		System.out.println(q.element()); // RE:NPE
		for (int i = 0; i <=10; i++) {

			q.offer(i);
		}
		System.out.println(q);
		System.out.println(q.poll());
		System.out.println(q);
		
		PriorityQueue<Object> q1=new PriorityQueue<Object>(new MyPriorityQueueComparator());
		q1.offer("A");
		q1.offer("G");
		q1.offer("H");
		q1.offer("B");
		q1.offer("S");
		System.out.println(q1);
	}
}
