package com.apex.session.advanced.assignment;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class RepeatedWordFromFile14 {

	public static void main(String[] args) throws IOException {

		System.out.println(findRepeatedwords("C:\\Users\\lokes\\OneDrive\\Desktop\\data.txt"));

		
		
	}

	private static String findRepeatedwords(String fileName) throws IOException {

		FileInputStream fis = null;
		DataInputStream dis = null;
		BufferedReader br = null;
		Map<String, Integer> wordMap = new HashMap<String, Integer>();
		try {
			fis = new FileInputStream(fileName);
			dis = new DataInputStream(fis);
			br = new BufferedReader(new InputStreamReader(dis));
			String line = null;
			while ((line = br.readLine()) != null) {
				StringTokenizer st = new StringTokenizer(line, " ");
				while (st.hasMoreTokens()) {
					String tmp = st.nextToken().toLowerCase();
					wordMap.put(tmp, wordMap.getOrDefault(tmp, 0) + 1);
				}
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (br != null)
					br.close();
			} catch (Exception ex) {
			}
		}
		
		System.out.println(wordMap);
		
         int maxcount=Integer.MIN_VALUE;
         String word="";
		
		for(Map.Entry<String, Integer> entry:wordMap.entrySet())
		{
			if(entry.getValue()> maxcount)
			{
				maxcount=entry.getValue();
				word=entry.getKey();
				
			}
		}
		return word;
	}

}
