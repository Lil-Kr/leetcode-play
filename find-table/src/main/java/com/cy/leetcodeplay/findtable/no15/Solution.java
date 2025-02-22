package com.cy.leetcodeplay.findtable.no15;

import java.util.*;

/**
 * @Author: Lil-K
 * @Date: 2024/9/6
 * @Description: no.15. 3Sum
 * link: https://leetcode.com/problems/3sum/description/
 */
public class Solution {

	public List<List<Integer>> threeSum(int[] nums) {
		if (nums.length < 3) return new ArrayList<>();

		Arrays.sort(nums);
		List<List<Integer>> res = new ArrayList<>();

		int l = -1, r = -1;
		for (int i = 0; i < nums.length - 2; i++) {
			// 跳过重复的元素
			if (i > 0 && nums[i] == nums[i - 1]) {
				continue;
			}

			int fix = nums[i];
			int target = 0 - fix;
			l = i + 1;
			r = nums.length - 1;

			while (l < r) {
				if (nums[l] + nums[r] > target) {
					r--;
				} else if (nums[l] + nums[r] < target) {
					l++;
				} else {
					res.add(Arrays.asList(fix, nums[l], nums[r]));

					// 跳过重复的元素
					while (l < r && nums[l] == nums[l + 1]) l++;
					while (l < r && nums[r] == nums[r - 1]) r--;

					l++; // 移动左指针
					r--; // 移动右指针
				}
			}
		}
		return res;
	}

}
