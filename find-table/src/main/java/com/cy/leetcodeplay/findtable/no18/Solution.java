package com.cy.leetcodeplay.findtable.no18;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Author: Lil-K
 * @Date: 2024/9/6
 * @Description: no.18.4Sum
 */
public class Solution {

	/**
	 *
	 * @param nums
	 * @param target
	 * @return
	 */
	public List<List<Integer>> fourSum(int[] nums, int target) {
		if (nums.length < 4) return new ArrayList<>();
		Arrays.sort(nums);

		List<List<Integer>> res = new ArrayList<>();
		for (int i = 0; i < nums.length - 3; i++) {
			if (i > 0 && nums[i] == nums[i - 1]) {
				continue;
			}
			for (int j = i + 1; j < nums.length - 2; j++) {
				if (j > i + 1 && nums[j - 1] == nums[j]) {
					continue;
				}

				int first = nums[i];
				int second = nums[j];
				// case 中有long
				long towSum = (long)target - first - second;

				int l = j + 1, r = nums.length - 1;

				while (l < r) {
					if (nums[l] + nums[r] > towSum) {
						r--;
					} else if (nums[l] + nums[r] < towSum) {
						l++;
					} else {
						res.add(Arrays.asList(first, second, nums[l], nums[r]));
						while (l < r && nums[l] == nums[l+1]) l++;
						while (l < r && nums[r] == nums[r - 1]) r--;

						l++;
						r--;
					}
				}
			}
		}

		return res;
	}
}