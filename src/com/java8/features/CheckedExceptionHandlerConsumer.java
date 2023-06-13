package com.java8.features;

public interface CheckedExceptionHandlerConsumer<Target,ExObj extends Exception> {
	
	public void accept(Target target)throws ExObj;

}
