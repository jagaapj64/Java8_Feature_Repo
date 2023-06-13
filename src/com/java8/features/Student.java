package com.java8.features;

public class Student {

	private int sid;
	private String name;
	private String grade;
	private double marks;

	public Student(int sid, String name, String grade, int marks) {
		super();
		this.sid = sid;
		this.name = name;
		this.grade = grade;
		this.marks = marks;
	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public double getMarks() {
		return marks;
	}

	public void setMarks(double marks) {
		this.marks = marks;
	}

}
