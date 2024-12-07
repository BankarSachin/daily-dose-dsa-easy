package com.ssb.dsa.study.arrays.stack;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Sachin
 * https://neetcode.io/problems/validate-parentheses
 */
public class ValidateParentheses {

	public boolean isValid(String s) {
		Map<Character,Character> master = new HashMap<>();
		master.put(')','(');
		master.put('}','{');
		master.put(']','[');
		
		Deque<Character> stack = new ArrayDeque<>();
		
		for(Character c : s.toCharArray()) {
			if(master.containsKey(c) && master.get(c).equals(stack.peek())) {
				stack.pop();
			}else {
				stack.push(c);
			}
		}
		return stack.isEmpty(); //If empty then valid Parentheses. Else invalid
	}

	
	
}
