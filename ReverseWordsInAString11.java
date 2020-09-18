package com.apex.session.advanced.assignment;

public class ReverseWordsInAString11 {
	
	public static void main(String[] args) {
		
		String str="i like this program very much";
		
		System.out.println(reverseword(str));
		
		String str1="Reverse String according to the number of words";
		
		System.out.println(reverseAccordingToWords(str1));
	}

	

	private static String reverseword(String str) {
		
		if(str==null )return null;
		
		if(str=="" || str.length()==1) return str;
		
		StringBuilder sb=new StringBuilder();
		
		String[] strs=str.split(" ");
		//This method does reverse of strings in O(n) time complexity 
		for(int i=strs.length-1;i>=0;i--)
		{
			sb.append(strs[i]).append(" ");
		}
		return sb.toString().trim();
	}
	
	
	private static String reverseAccordingToWords(String str1) {
		
		String[] strs=str1.split(" ");
		
		StringBuilder sb=new StringBuilder();
		
	    for(int i=0;i<strs.length;i++)
	    {
	    	sb.append(reverse(strs[i])).append(" ");
	    	
	    }
		return sb.toString().trim();
	}



	private static String reverse(String str) {
		
		char[] ch=str.toCharArray();
		
		for(int i=0;i<ch.length/2;i++)
		{
			 char temp=ch[i];
		        ch[i]=ch[ch.length-i-1];
		        ch[ch.length-i-1]=temp;
		}
		
		
		return String.valueOf(ch);
	}

}
