package com.te.javabasics.arrays;

import java.util.Arrays;

public class SecondSmallest {
	public static void main(String[] args) {
		int arr[] = { 1, 7, 3, 9, 2 };
		Arrays.sort(arr);
		System.out.println("second smallest number is" + " " + arr[arr.length - 4]);
	}

}
