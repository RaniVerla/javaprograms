package com.apex.session.advanced.assignment;

import java.util.HashMap;
import java.util.Stack;

//Balanced Brackets
public class BalancedBrackets2 {

	public static void main(String[] args) {
		String str = "{([])[({})]}";
		String str1 = "]{)[]([({})]}";
		

		System.out.println(validParantheses(str));
		System.out.println(validParantheses(str1));

	}

	private static boolean validParantheses(String str) {
		
		
		if(str==null || str=="") return true;
		//HashMap to save open and closed parantheses
		HashMap<Character, Character> map=new HashMap<>();
		map.put('{', '}');
		map.put('(', ')');
		map.put('[', ']');
		
		//Stack to save the characters
		Stack<Character> stack=new Stack<>();
		
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if(map.containsKey(ch))
			{
				stack.add(ch);
			}
			else
			{				
				if(!stack.isEmpty() && map.get(stack.peek())==ch)
					stack.pop();
				else
					return false;					
			}
		}
 return stack.isEmpty();

	}

}
