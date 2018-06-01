package com.test.entity;

public class Teacher {
	private int year;
	private String teacherName;
	private String subjectName;

	public Teacher(int year, String teacherName, String subjectName) {
		super();
		this.year = year;
		this.teacherName = teacherName;
		this.subjectName = subjectName;
	}

	@Override
	public String toString() {
		return "year=" + year + ", teacherName=" + teacherName + ", subjectName=" + subjectName;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getTeacherName() {
		return teacherName;
	}

	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}

	public String getSubjectName() {
		return subjectName;
	}

	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}

}
