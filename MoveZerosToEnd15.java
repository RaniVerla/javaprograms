package com.apex.session.advanced.assignment;

import java.util.Arrays;

public class MoveZerosToEnd15 {
	
	public static void main(String[] args) {
		int[] arr= {1,0,2,0,3,0,4,0};
		
		movezerosToEnd(arr);
	}

	private static void movezerosToEnd(int[] arr) {
		
		int j=0;
		
		for (int i = 0; i < arr.length; i++) {
			
			if(arr[i]!=0)
			{
				int temp=arr[j];
				arr[j]=arr[i];
				arr[i]=temp;
				j++;
			}
		}
		
		System.out.println(Arrays.toString(arr));
		
	}
	
	

}
