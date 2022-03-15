package com.te.javabasics.arrays;

import java.util.Arrays;

public class SecondLargest {
	public static void main(String[] args) {
		// first sort the given array
		// 1,7,3,9,4
		// 1,3,4,7,9
		// array.length-2 will give the value of second number from last(7)
		int arr[] = { 1, 7, 3, 9, 4 };
		Arrays.sort(arr);
		// first highest number
		// System.out.println("first highest number is" + " " + arr[arr.length - 1]);
		System.out.println("second highest number is" + " " + arr[arr.length - 2]);
	}

}
