package com.te.javabasics.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class StudentTest {
	public static void main(String[] args) {
		boolean temp = true;
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter a number");
		int number = scanner.nextInt();

		ArrayList<Student> arrayList = new ArrayList<Student>();
		arrayList.add(new Student(2, "Bhargav", "Banglore", 68, 23));
		arrayList.add(new Student(1, "Dinga", "Kanpur", 89, 21));
		arrayList.add(new Student(3, "Seema", "Pune", 96, 24));
		arrayList.add(new Student(7, "Kartik", "Mumbai", 45, 28));
		arrayList.add(new Student(5, "Rashmi", "Chennai", 54, 20));
		System.out.println(arrayList);
		do {
			System.out.println("enter 1 to get sort by id");
			System.out.println("enter 2 to get sort by name");
			System.out.println("enter 3 to get sort by address");
			System.out.println("enter 4 to get sort by marks");
			System.out.println("enter 5 to get sort by age");

			switch (number) {
			case 1:

				System.out.println("=============sort by id===========");
				Collections.sort(arrayList, new CompareByStudentId());
				for (Student student5 : arrayList) {
					System.out.println(student5);

				}
				break;

			case 2:
				System.out.println("=============sort by name===========");
				Collections.sort(arrayList, new CompareByStudentName());
				for (Student student5 : arrayList) {
					System.out.println(student5);

				}
				break;
			case 3:
				System.out.println("=============sort by Address===========");
				Collections.sort(arrayList, new CompareByStudentAddress());
				for (Student student5 : arrayList) {
					System.out.println(student5);

				}
				break;

			case 4:
				System.out.println("=============sort by Marks===========");
				Collections.sort(arrayList, new CompareByMarks());
				for (Student student5 : arrayList) {
					System.out.println(student5);

				}
				break;

			case 5:
				System.out.println("=============sort by age===========");
				Collections.sort(arrayList, new CompareByAge());
				for (Student student5 : arrayList) {
					System.out.println(student5);

				}
				break;
			}
			System.out.println("want to see student details again");
			String string = scanner.next();
			if (string.equalsIgnoreCase("yes")) {
				temp = true;
			} else if (string.equalsIgnoreCase("no")) {
				temp = false;
				System.out.println("exit");

			}

		} while (temp);
	}
}
