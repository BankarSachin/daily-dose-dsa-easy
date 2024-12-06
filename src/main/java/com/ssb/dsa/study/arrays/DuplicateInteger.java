package com.ssb.dsa.study.arrays;

import java.util.HashSet;
import java.util.Set;

/**
 * Q Link : https://neetcode.io/problems/duplicate-integer
 * */
public class DuplicateInteger {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();

        for(int i=0;i<nums.length;i++){
            if(!set.add(nums[i])){
                return true;
            }
            set.add(nums[i]);
        }
        return false;
    }
}
