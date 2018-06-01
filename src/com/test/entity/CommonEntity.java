package com.test.entity;

import java.util.List;
/*
 * class name changed
 */
public class CommonEntity {
	private static List<Student> studentList;
	private static List<Teacher> teacherList;
	private static List<JoinStudentTeacherEntity> joinList;
	

	public static List<JoinStudentTeacherEntity> getJoinList() {
		return joinList;
	}

	public static void setJoinList(List<JoinStudentTeacherEntity> joinList) {
		CommonEntity.joinList = joinList;
	}

	public static List<Teacher> getTeacherList() {
		return teacherList;
	}

	public static void setTeacherList(List<Teacher> teacherList) {
		CommonEntity.teacherList = teacherList;
	}

	public static List<Student> getStudentList() {
		return studentList;
	}

	public static void setStudentList(List<Student> studentList) {
		CommonEntity.studentList = studentList;
	}

}
