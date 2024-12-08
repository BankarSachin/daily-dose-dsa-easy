package com.ssb.dsa.study.binarysearch.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.ssb.dsa.study.binarysearch.BinarySearch;

class BinarySearchTest {

	@Test
	void successTest() {
		BinarySearch binarySearch = new BinarySearch();
		assertEquals(3, binarySearch.search(new int[]{-1,0,2,4,6,8}, 4));
	}
	
	@Test
	void successTest2() {
		BinarySearch binarySearch = new BinarySearch();
		assertEquals(-1, binarySearch.search(new int[]{-1,0,2,4,6,8}, 9));
	}
}
