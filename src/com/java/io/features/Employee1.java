package com.java.io.features;

import java.io.Serializable;

public class Employee1 implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -594956450890250834L;
	Department department=new Department();

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}
}
