package com.java.io.features;

import java.io.Serializable;

public class Lion1 extends Animal1 implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4300323531877982879L;
	int j = 200;

	public int getJ() {
		return j;
	}

	public void setJ(int j) {
		this.j = j;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public Lion1() {
		System.out.println("Lion class Constructors");
	}
}
