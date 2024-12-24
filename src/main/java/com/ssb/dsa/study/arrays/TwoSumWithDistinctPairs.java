package com.ssb.dsa.study.arrays;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class TwoSumWithDistinctPairs {

	public static void main(String[] args) {
		int target = 7;
		int[] items = {1,3,4,5,2,1,6,1,9,7,0};
		System.out.println(getUniquePairsofTwoSum(items ,target));
	}
	
	public static Map<Integer,Integer> getUniquePairsofTwoSum(int[] items,int target){
		
		Map<Integer, Integer> resultMap = new HashMap<>();
		Set<Integer> itemSet = new HashSet<>();
		
		for (int i : items) {
			int find = target -i;
			if (itemSet.contains(find)) {
				resultMap.put(Math.min(i, find), Math.max(i, find));
			}
			itemSet.add(i);
		}
		return resultMap;
	}
}
