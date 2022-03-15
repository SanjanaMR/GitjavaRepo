package com.te.javabasics.arrays;

public class Smallest {
	public static void main(String[] args) {
		int arr[] = { 5, 2, 7, 1, 9, 6 };
		int smallNumber = arr[5];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < smallNumber) {
				smallNumber = arr[i];
			}
		}
		System.out.println("small element in array is" + " " + smallNumber);
	}

}
