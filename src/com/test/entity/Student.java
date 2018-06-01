package com.test.entity;

public class Student {

	private int year;
	private String studentName;
	private int mark1;
	private int mark2;
	private int mark3;

	public Student(int year, String studentName, int mark1, int mark2, int mark3) {
		super();
		this.year = year;
		this.studentName = studentName;
		this.mark1 = mark1;
		this.mark2 = mark2;
		this.mark3 = mark3;
	}

	@Override
	public String toString() {
		return "year=" + year + ", studentName=" + studentName + ", mark1=" + mark1 + ", mark2=" + mark2
				+ ", mark3=" + mark3;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public int getMark1() {
		return mark1;
	}

	public void setMark1(int mark1) {
		this.mark1 = mark1;
	}

	public int getMark2() {
		return mark2;
	}

	public void setMark2(int mark2) {
		this.mark2 = mark2;
	}

	public int getMark3() {
		return mark3;
	}

	public void setMark3(int mark3) {
		this.mark3 = mark3;
	}

}
