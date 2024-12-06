package com.ssb.dsa.study.arrays;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Sachin
 * https://neetcode.io/problems/two-integer-sum
 */
public class TwoSum {

    public int[] twoSum(int[] nums, int target) {
    	Map<Integer, Integer> arrayMap =  new HashMap<>();
    	for (int i = 0; i < nums.length; i++) {
			int y = target - nums[i];
			if (arrayMap.containsKey(y)) {
				return new int[] {arrayMap.get(y),i};
			}
			arrayMap.put(nums[i],i);
    	}
    	return new int[] {};
    }
}
