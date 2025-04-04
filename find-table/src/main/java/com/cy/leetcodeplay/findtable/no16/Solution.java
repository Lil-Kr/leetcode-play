package com.cy.leetcodeplay.findtable.no16;

import java.util.Arrays;

/**
 * @Author: Lil-K
 * @Date: 2024/9/6
 * @Description: no.16. 3Sum Closest
 */
public class Solution {

	/**
	 *
	 * @param nums
	 * @param target
	 * @return
	 */
	public int threeSumClosest(int[] nums, int target) {
		if (nums.length < 3) return 0;

		Arrays.sort(nums);
		int closestSum = nums[0] + nums[1] + nums[2];
		int sum = 0;
		for (int i = 0; i < nums.length - 2; i++) {
			if (i > 0 && nums[i] == nums[i - 1]) {
				continue;
			}
			int first = nums[i];

			int l = i + 1, r = nums.length - 1;

			while (l < r) {
				sum = first + nums[l] + nums[r];
				// 更新最接近的和
				if (Math.abs(sum - target) < Math.abs(closestSum - target)) {
					closestSum = sum;
				}

				if (sum > target) {
					r--;
				} else if (sum < target) {
					l++;
				} else {
					return sum;
				}
			}
		}
		return closestSum;
	}
}
