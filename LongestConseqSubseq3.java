package com.apex.session.advanced.assignment;

import java.util.HashSet;

public class LongestConseqSubseq3 {
	
	public static void main(String[] args) {
		
		  int arr[] = { 1, 9, 3, 10, 4, 20, 2 }; 
		  
		  longestConseqSubseq(arr);
	}

	private static void longestConseqSubseq(int[] arr) {
		
		int max=0;
		
		HashSet<Integer> set = new HashSet<Integer>(); 
        int ans = 0; 
  
        // Hash all the array elements 
        for (int i = 0; i < arr.length; ++i) 
            set.add(arr[i]); 
        
        System.out.println(set);
		
		
		 for (int i = 0; i < arr.length; ++i) { 
			 
			 if(!set.contains(arr[i]-1))
			 {
				 int j=arr[i];
				  while(set.contains(j))
					  j++;
				  
				  System.out.println(j);
				  
				  if(max < j-arr[i])
					  max=j-arr[i];
			 }
		 }
		 System.out.println(max);
		
	}

}
