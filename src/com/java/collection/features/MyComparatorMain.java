package com.java.collection.features;

import java.util.TreeSet;

public class MyComparatorMain {

	public static void main(String[] args) {
		TreeSet<Integer> tset=new TreeSet<Integer>(new MyComparatorInteger());  // line ---> 1
		tset.add(10);  
		
		tset.add(0);     //compare(0,10); ==> +ve
		
		tset.add(15);    //compare(15,10);  ==> -ve
		
		tset.add(5);     //compare(5,10);  ==> +ve    --->//compare(5,0);  ==> -ve 
		
		tset.add(20);    //compare(20,10); ==> -ve    --->//compare(20,15); ==> -ve 
		
		tset.add(20);   //compare(20,10); ==> -ve    ---> //compare(20,15); ==> -ve   --->//compare(20,20); ==> 0
		System.out.println("MyComparatorInteger : "+tset);
	
		
		
		

//	 1.At line 1 if we are not passing comparator object then internally JVM will call compareTo() which is meant for default 
//	   natural sorting order in this case the output [0, 5, 10, 15, 20].
//	 2.At line if we our passing comparator object then JVM will call compare() which is meant for customized sorting order in
//	   this case ouptut is [20, 15, 10, 5, 0]. 
	
	
	TreeSet<String> tset2=new TreeSet<String>(new MyComparatorString()); 
	tset2.add("Ajay");
	tset2.add("Vijay");
	tset2.add("Raja");
	tset2.add("Saha");
	System.out.println("MyComparatorString : "+tset2);  // [Vijay, Saha, Raja, Ajay]
	
	
	
	
	/*
	 * until StringBuffer class won't provide implementation but since 11 version to
	 * StringBuffer class implements to Comparator Interface
	 */
	
//	TreeSet<Object> tset3=new TreeSet<Object>();
    TreeSet<StringBuffer> tset3=new TreeSet<StringBuffer>(new MyComparatorStringBuffer());
	tset3.add(new StringBuffer("A"));
	tset3.add(new StringBuffer("Z"));
	
//	tset3.add(new String("B"));
//	tset3.add(new StringBuffer("B"));
	
//	 1.If we our depending on default natural sorting order compulsory the object should be Comparable and Homogeneous otherwise 
//	   we will get RE saying ClassCastException.
//	 2.An object is said to be comparable if and only if corresponding class implements comparable interface,String class and 
//	   all Wrapper class already implements comparable interface.but StringBuffer class does'nt implements comparable interface 
//	   and hence we get CCE the above example.
	
//	Exception in thread "main" java.lang.ClassCastException: class java.lang.StringBuffer cannot be cast to class java.lang.String (java.lang.StringBuffer and java.lang.String are in module java.base of loader 'bootstrap')
//	at java.base/java.lang.String.compareTo(String.java:140)
//	at java.base/java.util.TreeMap.put(TreeMap.java:814)
//	at java.base/java.util.TreeMap.put(TreeMap.java:534)
//	at java.base/java.util.TreeSet.add(TreeSet.java:255)
//	at com.java.collection.features.MyComparatorMain.main(MyComparatorMain.java:52)
	
	
	tset3.add(new StringBuffer("L"));
	tset3.add(new StringBuffer("B"));
	System.out.println("MyComparatorStringBuffer : "+tset3);  //[A, B, L, Z]
	
	
	
	
	TreeSet<Object> tset4=new TreeSet<Object>(new MyComparatorStringAndStringBuffer());
	tset4.add("A");
	tset4.add(new StringBuffer("ABC"));
	tset4.add(new StringBuffer("AAA"));
	tset4.add("KK");
	tset4.add("PPPP");
	System.out.println("MyComparatorStringAndStringBuffer : "+tset4); // [A, KK, AAA, ABC, PPPP]
}
}
