package com.cy.leetcodeplay.matrix.findtable.no217;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @Author: Lil-K
 * @Date: 2024/9/6
 * @Description: no.217. Contains Duplicate
 */
public class Solution {

	/**
	 *
	 * @param nums
	 * @return
	 */
	public boolean containsDuplicate(int[] nums) {
		if (nums.length < 2) return false;

		Map<Integer, Integer> res = new HashMap<>();

		for (int i = 0; i < nums.length; i++) {
			res.put(nums[i], res.getOrDefault(nums[i], 0) + 1);
			if (res.getOrDefault(nums[i], 0) >= 2) {
				return true;
			}
		}
		return false;
	}

	/**
	 * 性能比Map好一些
	 * @param nums
	 * @return
	 */
	public boolean containsDuplicate2(int[] nums) {
		if (nums.length < 2) return false;

		Set<Integer> res = new HashSet<>();
		for (int i = 0; i < nums.length; i++) {
			if (res.contains(nums[i])) {
				return true;
			} else {
				res.add(nums[i]);
			}
		}
		return false;
	}
}
