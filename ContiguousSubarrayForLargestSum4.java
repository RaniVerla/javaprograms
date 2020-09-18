package com.apex.session.advanced.assignment;

public class ContiguousSubarrayForLargestSum4 {

	public static void main(String[] args) {

		int[] nums = { -2, -3, 4, 4,-1,-6 ,-2, 1,6, 5,-4, 8 ,-3 };

		System.out.println(maxSumArray(nums));

	}

	private static int maxSumArray(int[] nums) {

		int max_so_far = nums[0], max_ending_here = 0, start = 0, end = 0, s = 0;

		for (int i = 0; i < nums.length; i++) {
			
			System.out.println(nums[i]);
			max_ending_here = max_ending_here + nums[i];

			if (max_so_far < max_ending_here) {
				
				System.out.println(max_so_far+" "+max_ending_here);
				max_so_far = max_ending_here;
				start = s;
				end = i;
			}

			if (max_ending_here < 0) {
				max_ending_here = 0;
				s = i + 1;
			}
		}

		System.out.println("Starting index " + start);
		System.out.println("Ending index " + end);

		return max_so_far;

	}

}
