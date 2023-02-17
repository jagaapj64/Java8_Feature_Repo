package com.java8.features;

public class LamdaExpressionWithoutParams {

	public static void main(String[] args) {
		int width=10;
		String name="Hari";
		
		
		
		 //without lambda Expression, Drawable implementation using anonymous class  
		Drawable draw=new Drawable() {
			
			@Override
			public void draw() {
				System.out.println("Drawing 1 : "+width);
			}
		};
		draw.draw();

		//with lambda Expression,
		Drawable draw2=()->{ System.out.println("Drawing 2 : "+width);};
		draw2.draw();
		
		
		
		//without lambda Expression,with return Drawable implementation using anonymous class  
		Sayable say=new Sayable() {
			
			@Override
			public String say() {
				// TODO Auto-generated method stub
				return "Somethink I'm Returning as Name "+name;
			}
		};
		System.out.println("Sayable 1 : "+say.say());
		
		
		
		
		//with lambda Expression with return,
		Sayable s2=()->{
			return "Somethink I'm Returning as Name "+name;
		};
		System.out.println("Sayable 2 : "+s2.say());
	}

}
