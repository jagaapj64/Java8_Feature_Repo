package com.java.collection.features;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Vector;

public class MyEnumeration {

	public static void main(String[] args) {
		   Vector<Integer> v=new Vector<Integer>();
		      for (int i = 1; i <=10; i++) {
				v.addElement(i);
				
			}
			/*
			 * 1.Enumeration:- 
			 *  We can use enumeration to get object one by one from legacy collection object. We can create 
			 *  enumeration object by using elements methods of vector class.
			 */
		      
		      Enumeration<Integer> e=v.elements();
		      while (e.hasMoreElements()) {
		    	 Integer num=(Integer) e.nextElement();
		    	 if(num%2==0) {
		    		 System.out.println(num);
		    	 }
				
			}
		      System.out.println(v);
		      
		      

				/*
				 * 2.Iterator:- We can apply Iterator concpet for any collection objectt and
				 * hence it is universal cursors By using iterator we can perform both read and
				 * remove operation. We can create iterator object by using iterator() methods
				 * of collection interface
				 * 
				 * public Iterator iterator(); Iterator it1=c.iterator(); c---> for any
				 * collection object Methods:- ``````` public boolean hasNext(); public Object
				 * next(); public void remove();
				 */

				ArrayList<Integer> list=new ArrayList<Integer>();
				for (int i = 0; i <=10; i++) {
		            list.add(i);			
				}
				System.out.println(list);
				Iterator<Integer> iterator=	list.iterator();
				while (iterator.hasNext()) {
					Integer num=(Integer)iterator.next();
					if(num%2==0) {
						System.out.println(num);
					}
					else {
						iterator.remove();
					}
				}
				System.out.println(list);
				 
				/*
				 * ListIterator(I):- ````````````` 1.By using ListIterator we can move either
				 * forward or backward direction and hence it is bidirectional cursor. 2.By
				 * using ListIterator we can perform replacement and addition of new object in
				 * edition to read and remove operation. 3.We can create ListIterator by using
				 * listIterator() of List Interface. public ListIterator listIterator(); Ex:-
				 * ListIterator it1=l.listIterator(); l----> any collection object 4.
				 * ListIrerator is the child interface of Iterator and hence all methods present
				 * in Iterator by default available to ListIterator.
				 */
				
				LinkedList<String> linkedList=new LinkedList<String>();
				linkedList.add("jaga");
				linkedList.add("guru");
				linkedList.add("gopi");
				linkedList.add("thiru");
				ListIterator<String> itr=linkedList.listIterator();
				while (itr.hasNext()) {
					String name=itr.next();
					if(name.equals("jaga")) {
						itr.add("P.A");
					}else if(name.equals("guru")) {
						itr.remove();
					}else if(name.equals("gopi")) {
						itr.set("T.M");
					}
				}
				System.out.println(linkedList);
				
				Vector<Object> vector=new Vector<>();
				Enumeration<Object> eum=vector.elements();
				Iterator<Object> itrator=vector.iterator();
				ListIterator<Object> listIterator=vector.listIterator();
				System.out.println("enum         : "+eum.getClass().getName());
				System.out.println("itrator      : "+itrator.getClass().getName());
				System.out.println("listIterator : "+listIterator.getClass().getName());
				
				//output:
				
//				enum         : java.util.Vector$1
//				itrator      : java.util.Vector$Itr
//				listIterator : java.util.Vector$ListItr
				
	}

}
