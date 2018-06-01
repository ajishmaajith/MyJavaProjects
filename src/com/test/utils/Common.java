package com.test.utils;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.test.entity.CommonEntity;
import com.test.entity.Student;
import com.test.entity.Teacher;

public class Common {

	public static void loadData() throws IOException {
		loadStudentDetails();
		loadTeacherDetails();

	}

	private static void loadTeacherDetails() throws IOException {
		String file = "//Users//achuzz//eclipse-workspace//Student//Teacher.txt";
		String line;
		FileReader read = new FileReader(file);
		BufferedReader buffer = new BufferedReader(read);
		List<Teacher> teacherList = new ArrayList<>();
		while ((line = buffer.readLine()) != null) {
			String[] teacherDetails = line.split(",");
			String years = teacherDetails[0];
			String teacherName = teacherDetails[1];
			String subjectName = teacherDetails[2];

			Teacher obj = new Teacher(Integer.parseInt(years), teacherName, subjectName);
			teacherList.add(obj);

		}
		CommonEntity.setTeacherList(teacherList);
		System.out.println("Student details::" + teacherList);

	}

	private static void loadStudentDetails() throws IOException {
		String file = "//Users//achuzz//eclipse-workspace//Student//Student.txt";
		String line;
		FileReader read = new FileReader(file);
		BufferedReader buffer = new BufferedReader(read);
		List<Student> studentList = new ArrayList<>();
		while ((line = buffer.readLine()) != null) {
			String[] studentDetails = line.split(",");
			String years = studentDetails[0];
			String studentName = studentDetails[1];
			String mark1 = studentDetails[2];
			String mark2 = studentDetails[3];
			String mark3 = studentDetails[4];
			Student obj = new Student(Integer.parseInt(years), studentName, Integer.parseInt(mark1),
					Integer.parseInt(mark2), Integer.parseInt(mark3));
			studentList.add(obj);

		}
		CommonEntity.setStudentList(studentList);
		System.out.println("Student details::" + studentList);
	}

}
