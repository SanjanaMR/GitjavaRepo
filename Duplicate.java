package com.te.javabasics.arrays;

import java.util.Arrays;

public class Duplicate {
	public static void main(String[] args) {

		int arr[] = { 2, 5, 3, 7, 2, 2, 4, 9, 8 };
		System.out.println(Arrays.toString(arr));
		for (int j = 0; j < arr.length; j++) {
			int c = 0;
			for (int i = 0; i < arr.length; i++) {
				if (arr[i] == arr[j] && i != j) {
					c++;
					arr[i] = '\n';
				}
			}
			if (arr[j] != '\n' && c > 0) {
				System.out.print(arr[j] + " ");
			}
		}

	}
}