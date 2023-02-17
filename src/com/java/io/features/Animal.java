package com.java.io.features;

import java.io.Serializable;

public class Animal implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1552960794607075679L;
	int i = 10;
	/*
	 * 1. In the above example even thougth Lion class implements serializable we
	 * can serializable Lion object because it is parent class implements
	 * serializable Animal 2. Object class does'nt implement serializable interface
	 */

	public int getI() {
		return i;
	}

	public void setI(int i) {
		this.i = i;
	}

}
