package com.apex.session.advanced.assignment;

import java.util.HashSet;

/*
 * Given an array of integers, find two numbers such that
 * they add up to a specific target number
 * */
public class SumOfTwoNums1 {

	public static void main(String[] args) {

		int[] arr = { 3, 4, 7, 1 };

		int target = 7;

		// creating a method to find sum of two numbers
		sumOfTwo(arr, target);

	}

	// static method to find sum of two numbers as we are not creating the object
	private static void sumOfTwo(int[] arr, int target) {

		// Using HashSet to store the nums and avoid duplicate sums
		HashSet<Integer> set = new HashSet<>();

		// iterating the arr of numbers
		for (int i = 0; i < arr.length; i++) {
			// trying to do it in reverse approach
			int diff = target - arr[i];

			if (set.contains(diff)) {
				System.out.println("sum of " + arr[i] + " + " + diff + " = " + target);
			}
			
			// We are adding the number to the set
			set.add(arr[i]);

		}

	}

}
