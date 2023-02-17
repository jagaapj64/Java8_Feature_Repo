package com.java.collection.features;

import java.util.WeakHashMap;

public class MyWeakHashMap {

	public static void main(String[] args) throws InterruptedException {
//		  1.It is exactly same as HashMap excpet the following difference
//		  2.In the case of HashMap even though object does'nt have any reference it is not eligible for gc if it associated with HashMap that is HashMap demoniates
//		    garbage collector.
//		    But in this case of WeakHashMap, if object does'nt contain any reference it is eligible for gc even though object associated with WeakHashMap that is 
//		    garbage collector demoniates WeakHashMap.
		
//       HashMap<Object, Object> map=new HashMap<>();
       WeakHashMap<Object, Object> map=new WeakHashMap<>();
       Temp t=new Temp();
       map.put(t, "jaga");
       System.out.println(map);
       t=null;
       System.gc();
       Thread.sleep(5000);
       System.out.println(map);
       
	}

}
