package com.ssb.dsa.study.test.twopointer;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import com.ssb.dsa.study.twopointer.IsPalindrome;

class IsPalindromeTest {

	@Test
	void testTrue() {
		IsPalindrome isPalindrome = new IsPalindrome();
		assertTrue(isPalindrome.isPalindrome("Was it a car or a cat I saw?"));
	}

	@Test
	void testFalse() {
		IsPalindrome isPalindrome = new IsPalindrome();
		assertFalse(isPalindrome.isPalindrome("tab a cat"));
	}
}
