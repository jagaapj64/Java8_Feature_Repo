package com.java.io.features;

public class Lion extends Animal {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6037126907566154366L;
	int j = 20;

	/*
	 * Even though doe'nt implement serializable we can serializable child class
	 * object if parent class implements serializable interface that is serilaizable
	 * nature is inheriting from parent to child hence if parent is serializable
	 * then by default every child is serializable
	 */
	
	/*
	 * 1. In the above example even thougth Lion class implements serializable we
	 * can serializable Lion object because it is parent class implements
	 * serializable Animal 2. Object class does'nt implement serializable interface
	 */
	public int getJ() {
		return j;
	}

	public void setJ(int j) {
		this.j = j;
	}

}
