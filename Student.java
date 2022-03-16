package com.te.javabasics.collection;

import java.util.Comparator;

public class Student implements Comparator<Student> {
	int studentId;
	String studentName;
	String studentAddress;
	int marks;
	int age;

	public Student(int studentId, String studentName, String studentAddress, int marks, int age) {

		this.studentId = studentId;
		this.studentName = studentName;
		this.studentAddress = studentAddress;
		this.marks = marks;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentAddress=" + studentAddress
				+ ",marks=" + marks + ",age=" + age + "]";

	}

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		return 0;
	}

}
