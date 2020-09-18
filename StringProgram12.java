package com.apex.session.advanced.assignment;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class StringProgram12 {
	
	public static void main(String[] args) {
		
		String str="apexjavatrainingsessions";
		
	    mostRepeatedCharacter(str);
		
		
	}

	private static void mostRepeatedCharacter(String str) {
		
		int max=Integer.MIN_VALUE;
		HashMap<Character, Integer> map=new HashMap<>();
		char repeatedchar=' ';
		
		for (int i = 0; i < str.length(); i++)
			map.put(str.charAt(i), map.getOrDefault(str.charAt(i),0)+1);
		
		for(Map.Entry<Character, Integer> entry:map.entrySet())
		{
			if(entry.getValue() > max)
			{
				max=entry.getValue();
				repeatedchar=entry.getKey();
			}
		}
		System.out.println("Most Repeated Character is : "+repeatedchar);
		
		System.out.println("number of times each character is repeated");
		for (Map.Entry entry : map.entrySet()) { 
            System.out.println(entry.getKey() + " ==== " + entry.getValue()); 
        }
		
		
		System.out.println("--------------- arrange in the order of repeations -----------");
		
		List<Entry<Character, Integer>> list = sortByValue(map);
        for(Entry<Character, Integer> entry:list){
            System.out.println(entry.getKey()+" ==== "+entry.getValue());
        }
		
	}

	private static List<Entry<Character, Integer>> sortByValue(HashMap<Character, Integer> map) {
	
		List<Map.Entry<Character,Integer>> list=new LinkedList<Map.Entry<Character,Integer>>(map.entrySet());
		
		Collections.sort(list, new Comparator<Map.Entry<Character,Integer>>() {

			@Override
			public int compare(Entry<Character, Integer> o1, Entry<Character, Integer> o2) {
				return (o1.getValue().compareTo(o2.getValue()));
			}
		});
	        
	        return list;
	}

	
}
