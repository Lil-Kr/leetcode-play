package com.cy.leetcodeplay.find.no220;

import java.util.TreeSet;

/**
 * @Author: Lil-K
 * @Date: 2024/9/6
 * @Description: no.220. Contains Duplicate III
 */
public class Solution {

	public boolean containsNearbyAlmostDuplicate(int[] nums, int indexDiff, int valueDiff) {

		TreeSet<Integer> res = new TreeSet<>();
		for (int i = 0; i < nums.length; i++) {
			if (res.ceiling(nums[i] - valueDiff) != null
				&& res.ceiling(nums[i] - valueDiff) <= nums[i] + valueDiff) {
				return true;
			}
			res.add(nums[i]);

			if (res.size() == indexDiff + 1) {
				res.remove(nums[i - indexDiff]);
			}

		}
		return false;
	}
}
