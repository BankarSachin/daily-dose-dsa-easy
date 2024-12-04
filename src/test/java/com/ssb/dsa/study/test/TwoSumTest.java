package com.ssb.dsa.study.test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

import com.ssb.dsa.study.TwoSum;

class TwoSumTest {

	@Test
	void test() {
		TwoSum twoSum = new TwoSum();
		assertArrayEquals(new int[]{0,1},twoSum.twoSum(new int[]{3,4,5,6}, 7));
	}
	
	@Test
	void test2() {
		TwoSum twoSum = new TwoSum();
		assertArrayEquals(new int[]{0,2},twoSum.twoSum(new int[]{4,5,6},10));
	}
	
	@Test
	void test3() {
		TwoSum twoSum = new TwoSum();
		assertArrayEquals(new int[]{0,1},twoSum.twoSum(new int[]{5,5},10));
	}

}
