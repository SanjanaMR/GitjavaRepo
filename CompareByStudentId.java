package com.te.javabasics.collection;

import java.util.Comparator;

public class CompareByStudentId implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		return o1.studentId - o2.studentId;
	}

}
