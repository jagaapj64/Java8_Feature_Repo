package com.java8.features;

public class LamdaExpressionWithThread {

	public static void main(String[] args) {

		Runnable r1 = new Runnable() {
        @Override
			public void run() {

				System.out.println("Thread 1 is Running");
             }
		};
		Thread t1=new Thread(r1);
		t1.start();
		
		Runnable r2=()->{
			System.out.println("Thread 2 is Running");
		};

		Thread t2=new Thread(r2);
		t2.start();
	}
	
	

}
