package com.te.javabasics.collection;

import java.util.Comparator;

public class CompareByStudentName implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {

		return o1.studentName.compareTo(o2.studentName);
	}

}
