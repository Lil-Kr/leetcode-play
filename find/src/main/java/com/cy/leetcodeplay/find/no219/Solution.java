package com.cy.leetcodeplay.find.no219;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: Lil-K
 * @Date: 2024/9/6
 * @Description: no.219. Contains Duplicate II
 */
public class Solution {

	/**
	 *
	 * @param nums
	 * @param k
	 * @return
	 */
	public boolean containsNearbyDuplicate(int[] nums, int k) {
		Map<Integer, Integer> res = new HashMap<>();

		for (int i = 0; i < nums.length; i++) {
			if (res.containsKey(nums[i]) && i - res.getOrDefault(nums[i], -1) <= k) {
				return true;
			}

			res.put(nums[i], i);
		}

		return false;
	}
}