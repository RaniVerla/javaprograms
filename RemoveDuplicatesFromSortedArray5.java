package com.apex.session.advanced.assignment;

import java.util.Arrays;

//Remove Duplicates from Sorted Array
public class RemoveDuplicatesFromSortedArray5 {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 2, 3, 3, 4, 4, 5, 5 };
		
		System.out.println(Arrays.toString(arr));
		int n=removeDuplicates(arr);
		
		for(int i=0;i<n;i++)
			System.out.print(arr[i]+" ");	   
	
	}

	private static int removeDuplicates(int[] arr) {

		int n = arr.length;
		if (n == 0 || n == 1)
			return n;
		int j = 0;
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] != arr[i + 1]) 
				arr[j++] = arr[i];			
		}
		arr[j++] = arr[n-1]; 
		return j;

	}

}
