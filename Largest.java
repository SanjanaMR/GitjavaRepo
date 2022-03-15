package com.te.javabasics.arrays;

import java.util.Scanner;

public class Largest {
	public static void main(String[] args) {
		int arr[] = { 1, 2, 95, 4, 5 };
		int largeNumber = arr[0];// assuming that my largenumber is arr[0]//
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > largeNumber) {
				largeNumber = arr[i];
			}
		}
		System.out.println("the largest number is" + " " + largeNumber);
	}

}
