package com.te.javabasics.common;

import java.util.Scanner;

public class MonthYear {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the month");
		String month = scanner.next();
		System.out.println("enter the year");
		int year = scanner.nextInt();

		switch (month) {
		case "january":
			System.out.println("number of days are 31");
			break;

		case "february":
			if ((year % 4 == 0) && (year % 400 == 0) || (year % 100 != 0)) {
				System.out.println(year + "is a leap year");
				System.out.println("number of days is 29");

			} else {
				System.out.println(year + "is not a leap year");
				System.out.println("number of days is 28");
			}
			break;
		case "march":
			System.out.println("number of days are 31");
			break;

		case "april":
			System.out.println("number of days are 30");
			break;
		case "may":
			System.out.println("number of days are 31");
			break;
		case "june":
			System.out.println("number of days are 30");
			break;
		case "july":
			System.out.println("number of days are 31");
			break;
		case "august":
			System.out.println("number of days are 31");
			break;
		case "september":
			System.out.println("number of days are 30");
			break;
		case "october":
			System.out.println("number of days are 31");
			break;
		case "november":
			System.out.println("number of days are 30");
			break;
		case "december":
			System.out.println("number of days are 31");
			break;
		default:
			System.out.println("invalid input");
		}

	}

}
