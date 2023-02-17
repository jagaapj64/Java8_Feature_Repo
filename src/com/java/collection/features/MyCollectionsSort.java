package com.java.collection.features;

import java.util.ArrayList;
import java.util.Collections;

public class MyCollectionsSort {

	public static void main(String[] args) {

     ArrayList<String> list=new ArrayList<>();
     list.add("a");
     list.add("z");
     list.add("h");
     list.add("d");
     System.out.println("D.N.S.O : "+list);
     Collections.sort(list);
     System.out.println("D.N.S.O : "+list);
     
     ArrayList<String> list2=new ArrayList<>();
     list2.add("s");
     list2.add("o");
     list2.add("u");
     list2.add("r");
     System.out.println("\nC.S.O : "+list2);
     Collections.sort(list2,new MyCollectionsSortComparator());
     System.out.println("C.S.O : "+list2);
     
//     1.The above search methods internally will use binary search algorithms
//     2.successful search returns index.
//     3.Unsuccessful search returns insertionPoint.
//     4.insertionPoint is the location where we can place target element in sorted list.
//     5.before calling binarySearch methods compulsory list should be Sorted otherwise we will get unpredictable result.
//     6.If the list is sorted according to comparator then at the time search operation also we have to pass same comparator object otherwise we 
//       will get unpredictable result.
     System.out.println("\nD.N.S.O : "+list);  // [a, d, h, z]
     System.out.println(Collections.binarySearch(list, "z")); // 3 It return index as result
     System.out.println(Collections.binarySearch(list, "e")); //-3 It return insertionPoint as result
     
     ArrayList<Integer> list3=new ArrayList<Integer>();
     list3.add(15);
     list3.add(0);
     list3.add(20);
     list3.add(5);
     System.out.println("\nD.N.S.O.Integer.Before.Sort : "+list3);
     Collections.sort(list3,new MyCollectionsBinarySearchComparator());
     System.out.println("D.N.S.O.Integer.After.Sort : "+list3);
     System.out.println(Collections.binarySearch(list3, 10, new MyCollectionsBinarySearchComparator()));
     System.out.println(Collections.binarySearch(list3, 18, new MyCollectionsBinarySearchComparator()));
//     System.out.println(Collections.binarySearch(list3, 17)); // unpredictable error
     System.out.println("D.N.S.O.Integer.After.Search : "+list3);
     
     
     ArrayList<Integer> list4=new ArrayList<Integer>();
     list4.add(10);
     list4.add(56);
     list4.add(78);
     list4.add(57);
     System.out.println("Before Reverse List :"+list4);
     Collections.reverse(list4);
     System.out.println("After Reverse List :"+list4);

	}

}
