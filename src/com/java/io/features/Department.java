package com.java.io.features;

import java.io.Serializable;

public class Department implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8258864334911426804L;

	public EmployeeBranch getEmployeeBranch() {
		return employeeBranch;
	}

	public void setEmployeeBranch(EmployeeBranch employeeBranch) {
		this.employeeBranch = employeeBranch;
	}

	EmployeeBranch employeeBranch=new EmployeeBranch();
}
