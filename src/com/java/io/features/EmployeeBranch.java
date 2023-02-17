package com.java.io.features;

import java.io.Serializable;

public class EmployeeBranch implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3123859279957300429L;

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	private String branch="Chennai";
}
