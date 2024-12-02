package com.ssb.dsa.study.test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import com.ssb.dsa.study.DuplicateInteger;

class DuplicateIntegerTest {

	@Test
	void testTrue() {
		DuplicateInteger duplicateInteger = new DuplicateInteger();
		assertTrue(duplicateInteger.hasDuplicate(new int[]{1,2,1}));
	}
	
	@Test
	void testFalse() {
		DuplicateInteger duplicateInteger = new DuplicateInteger();
		assertFalse(duplicateInteger.hasDuplicate(new int[]{1,2,3}));
	}

}
