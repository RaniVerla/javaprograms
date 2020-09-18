package com.apex.session.advanced.assignment;

import java.util.HashMap;
import java.util.Map;

public class MostRepeatedWord13 {
	
	public static void main(String[] args) {
		String str="Ram went went to to to his home";
		System.out.println(mostRepeatedWord(str));
		
	}

	private static String mostRepeatedWord(String str) {
		
		int max=Integer.MIN_VALUE;
		HashMap<String, Integer> map=new HashMap<>();
		
		String repeatedString="";
		
		String[] strs=str.split(" ");
		
		for (int i = 0; i < strs.length; i++)
			map.put(strs[i], map.getOrDefault(strs[i],0)+1);
		
		for(Map.Entry<String, Integer> entry:map.entrySet())
		{
			if(entry.getValue() > max)
			{
				max=entry.getValue();
				repeatedString=entry.getKey();
			}
		}
		return repeatedString;
		
		
	}
	
}
