package com.test.utils;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.Year;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.test.entity.CommonEntity;
import com.test.entity.JoinStudentTeacherEntity;
import com.test.entity.Student;
import com.test.entity.Teacher;

public class StudentTeacherutils {

	public static void sort() {
		sortStudentBasedOnMark1();
		sortTeacherBasedOnYear();
		

	}

	public static void SameYearTeacherStudent() {
		List<JoinStudentTeacherEntity> list=CommonEntity.getJoinList();
		
			Comparator<JoinStudentTeacherEntity> com=new Comparator<JoinStudentTeacherEntity>() {

				@Override
				public int compare(JoinStudentTeacherEntity o1, JoinStudentTeacherEntity o2) {
					if(o1.getMark2()>o2.getMark2())
					return -1;
					else
					return 1;
				}
			};
		Collections.sort(list, com);
		System.out.println("details::"+list);
		for(JoinStudentTeacherEntity ob:list) {
			System.out.println("Details::"+ob.getMark2()+","+ob.getStudentName()+","+ob.getTeacherName());
		}
		
	}

	private static void sortTeacherBasedOnYear() {
		List<Teacher> teacherList = CommonEntity.getTeacherList();
		Comparator<Teacher> com = new Comparator<Teacher>() {

			@Override
			public int compare(Teacher o1, Teacher o2) {
				if (o1.getYear() > o2.getYear())
					return 1;
				else
					return -1;
			}
		};
		Collections.sort(teacherList, com);
		System.out.println("\nTeachers based on year" + teacherList);
		for (Teacher obj : teacherList) {
			System.out.println("Teacher based on year::" + obj.getYear() + "," + obj.getTeacherName());
		}

	}

	private static void sortStudentBasedOnMark1() {
		List<Student> students = CommonEntity.getStudentList();
		Comparator<Student> com = new Comparator<Student>() {

			@Override
			public int compare(Student o1, Student o2) {
				if (o1.getMark1() > o2.getMark1())
					return 1;
				else
					return -1;
			}
		};
		Collections.sort(students, com);
		System.out.println("Sorting completed..........");
		System.out.println("\nStudents in ascending order based on mark1 " + students);
		for (Student obj : students) {
			System.out.println(
					"Students based on mark1::" + obj.getMark1() + "," + obj.getStudentName() + "," + obj.getYear());
		}

	}

	public static void joinTeacherStudentBasedOnYear() throws IOException {
		List<Student> studentList = CommonEntity.getStudentList();
		List<Teacher> teacherList = CommonEntity.getTeacherList();
		List<JoinStudentTeacherEntity> joinList = new ArrayList<>();

		for (Student ob1 : studentList) {
			for (Teacher ob : teacherList) {
				if (ob1.getYear() == ob.getYear()) {
					JoinStudentTeacherEntity obj = new JoinStudentTeacherEntity(ob1.getYear(), ob1.getStudentName(),
							ob1.getMark1(), ob1.getMark2(), ob1.getMark3(), ob.getTeacherName(), ob.getSubjectName());
					joinList.add(obj);
				}
			}

		}
		System.out.println("Join list::" + joinList);
		CommonEntity.setJoinList(joinList);
		System.out.println("Joining completed......................");
		writeToFile(joinList);
	}

	private static void writeToFile(List<JoinStudentTeacherEntity> joinList) throws IOException {
		
		String file = "//Users//achuzz//eclipse-workspace//StudentTeacherRecord//ThirdFile.txt";
		BufferedWriter writes = new BufferedWriter(new FileWriter(file));
		for (int i = 0; i < joinList.size(); i++) {
			if (i == 0) {
				writes.write("#Year,Student Name,Mark1,Mark2,Mark3,Teacher Name,Subject Name\n");
			}
			StringBuilder build = new StringBuilder();
			build.append(joinList.get(i).toString());
			writes.write(build.toString());
			writes.write("\n");
		}
		writes.close();
	}
}
