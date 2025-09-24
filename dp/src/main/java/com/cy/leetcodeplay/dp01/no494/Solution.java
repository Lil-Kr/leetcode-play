package com.cy.leetcodeplay.dp01.no494;

import java.util.Arrays;

/**
 * @Author: Lil-K
 * @Date: 2025/9/24
 * @Description: no.494. Target Sum
 * link: https://leetcode.com/problems/target-sum/description/
 *
 * todo: 未录入Anki
 */
public class Solution {

	/**
	 *
	 * @param nums
	 * @param target
	 * @return
	 */
	public int findTargetSumWays(int[] nums, int target) {
		int sum = Arrays.stream(nums).sum();
		if (target > sum || target < -sum) {
			return 0;
		}
		if ((sum - target) % 2 != 0) {
			return 0;
		}
		int sum2 = (sum - target) / 2;
		if (sum2 < 0) {
			return 0;
		}

		int[] dp = new int[sum2 + 1];
		dp[0] = 1;
		for (int num : nums) {
			for (int j = sum2; j >= num; j --) {
				dp[j] += dp[j - num];
			}
		}
		return dp[sum2];
	}
}