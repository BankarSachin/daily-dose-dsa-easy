package com.ssb.dsa.study.twopointer;

/**
 * @author Sachin
 * https://neetcode.io/problems/is-palindrome
 */
public class IsPalindrome {

    public boolean isPalindrome(String s) {
    	s = s.toLowerCase();
    	
    	int leftPointer = 0;
    	int rightPointer= s.length()-1;
    	
    	while(rightPointer>=leftPointer) {
			char left = s.charAt(leftPointer);
			char right = s.charAt(rightPointer);
			
			if (!(('a' <= left && left <='z')||('0'<= left && left <= '9'))) {
				leftPointer++;
			}else if(!(('a' <= right && right <='z')||('0'<= right && right <= '9'))) {
				rightPointer--;
			}else if(left!=right) {
				return false;
			}else {
				leftPointer++;
				rightPointer--;
			}
		}
    	return true;
    }
}
