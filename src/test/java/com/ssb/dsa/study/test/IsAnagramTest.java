package com.ssb.dsa.study.test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

import com.ssb.dsa.study.IsAnagram;

@TestInstance(Lifecycle.PER_CLASS)
class IsAnagramTest {

	private static IsAnagram isAnagram;
	
	@BeforeAll
	static void init() {
		isAnagram = new IsAnagram();
	}
	
	@Test
	void anagramTrueTest() {
		assertTrue(isAnagram.isAnagram("racecar", "carrace"));
	}
	
	
	@Test
	void anagramFalseTest() {
		assertFalse(isAnagram.isAnagram("jar", "jam"));
	}
	
	@AfterAll
	static void teardown() {
		isAnagram = null;
	}
}
