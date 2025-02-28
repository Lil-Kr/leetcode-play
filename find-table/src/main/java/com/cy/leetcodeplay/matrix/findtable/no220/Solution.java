package com.cy.leetcodeplay.matrix.findtable.no220;

import java.util.TreeSet;

/**
 * @Author: Lil-K
 * @Date: 2024/9/6
 * @Description: no.220. Contains Duplicate III
 * link: https://leetcode.com/problems/contains-duplicate-iii/description/
 */
public class Solution {

	/**
	 * indexDiff --> 固定窗口大小
	 * @param nums
	 * @param indexDiff
	 * @param valueDiff
	 * @return
	 */
	public boolean containsNearbyAlmostDuplicate(int[] nums, int indexDiff, int valueDiff) {

		TreeSet<Integer> res = new TreeSet<>();
		for (int i = 0; i < nums.length; i++) {
			/**
			 * 数学中 绝对值运算
			 * |v - x| <= t  --> v - t <= x <= v + t 成立
			 */
			if (res.ceiling(nums[i] - valueDiff) != null
				&& res.ceiling(nums[i] - valueDiff) <= nums[i] + valueDiff) {
				return true;
			}
			res.add(nums[i]);

			/**
			 * indexDiff 作为窗口的固定大小, 妙啊
			 */
			if (res.size() == indexDiff + 1) {
				res.remove(nums[i - indexDiff]);
			}

		}
		return false;
	}
}
