package com.test.driver;

import java.io.IOException;

import com.test.utils.Common;
import com.test.utils.StudentTeacherutils;

// This is developed by Achu
public class StudentTeacherDriver {

	public static void main(String[] args) {
		try {
			Common.loadData();
			StudentTeacherutils.sort();
			StudentTeacherutils.joinTeacherStudentBasedOnYear();
			StudentTeacherutils.SameYearTeacherStudent();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
