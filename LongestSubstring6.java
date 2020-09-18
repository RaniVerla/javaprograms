package com.apex.session.advanced.assignment;

import java.util.HashMap;

public class LongestSubstring6 {

	public static void main(String[] args) {

		//String str = "ABDEFGABEF";
		
		String str = "GEEKSFORGEEKS";

		System.out.println(longestSubstring(str));

	}

	private static String longestSubstring(String str) {

		HashMap<Character, Integer> map = new HashMap<>();

		String output = "";

		for (int start = 0, end = 0; end < str.length(); end++) {
              //ABDEFGABEF
			char ch = str.charAt(end);
			System.out.println(ch);
			System.out.println(start + " " + end);
			if (map.containsKey(ch)) {		
				System.out.println("inside map if statement ");
				start = Math.max(map.get(ch)+1, start);
				System.out.println("start " +start +" end = " + end);
			}
			System.out.println("output.length() " +( end - start + 1));
			if (output.length() < (end - start + 1)) {
				output = str.substring(start, end + 1);
				System.out.println("output String = "+output);
			}
			map.put(ch, end);
		}
		
		System.out.println(map);

		return output;

	}

}
