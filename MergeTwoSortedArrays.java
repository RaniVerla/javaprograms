package com.apex.session.advanced.assignment;

import java.util.Arrays;

public class MergeTwoSortedArrays {

	public static void main(String[] args) {
		int[] arr1 = { 1, 3, 5, 0, 0, 0 };
		int[] arr2 = { 2, 4, 6 };

		mergeTwoSortedArrays(arr1, arr2);
	}

	private static void mergeTwoSortedArrays(int[] arr1, int[] arr2) {

		int i = 0, j = 0, k = 0, a1 = arr1.length, a2 = arr2.length;

		while (i < a1 && j < a2) {
			
			if(arr1[i]< arr2[j])
				arr1[k++]=arr1[i];
			else
				arr1[k++]=arr2[j];
		}
		
		
		System.out.println(Arrays.toString(arr1));

	}

}
