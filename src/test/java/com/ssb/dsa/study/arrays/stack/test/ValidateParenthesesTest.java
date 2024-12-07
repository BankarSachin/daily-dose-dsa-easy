package com.ssb.dsa.study.arrays.stack.test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import com.ssb.dsa.study.arrays.stack.ValidateParentheses;

class ValidateParenthesesTest {

	@Test
	void test() {
		ValidateParentheses validateParentheses = new ValidateParentheses();
		assertTrue(validateParentheses.isValid("([{}])"));
	}
	
	@Test
	void testFalse() {
		ValidateParentheses validateParentheses = new ValidateParentheses();
		assertFalse(validateParentheses.isValid("[(])"));
	}

}
