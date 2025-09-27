package com.cy.leetcodeplay.dp01package.no416;

import java.util.Arrays;

/**
 * @Author: Lil-K
 * @Date: 2025/9/27
 * @Description: no.416. Partition Equal Subset Sum
 * link: https://leetcode.com/problems/partition-equal-subset-sum/description/
 *
 * todo: 未录入Anki
 */
public class Solution {

	/**
	 * solution: recursive
	 * @param nums
	 * @return
	 */
	public boolean canPartition(int[] nums) {
		int n = nums.length;
		int sum = Arrays.stream(nums).sum();
		if (sum % 2 != 0) {
			return false;
		}
		sum /= 2;
		int[] dp = new int[n + 1];
		return f1(nums, n - 1, sum, dp);
	}

	private boolean f1(int[] nums, int i, int sum, int[] dp) {
		if (sum == 0) {
			return true;
		}
		if (sum < 0 || i < 0) {
			return false;
		}
		if (dp[i] != 0) {
			return dp[i] == 1;
		}
		dp[i] = (f1(nums, i - 1, sum, dp) || f1(nums, i - 1, sum - nums[i], dp)) ? 1 : 0;
		return dp[i] == 1;
	}

	/**
	 * solution2: dp
	 * @param nums
	 * @return
	 */
	public boolean canPartition2(int[] nums) {
		int n = nums.length;
		int sum = Arrays.stream(nums).sum();
		if (sum % 2 != 0) {
			return false;
		}
		sum /= 2;
		boolean[][] dp = new boolean[n + 1][sum + 1];
		/**
		 * 目标和0时, 一个都不选, 一定可行, true
		 */
		for (int i = 0; i <= n; i ++) {
			dp[i][0] = true;
		}

		/**
		 * 不选任何数字, 目标和 > 0, 一定不可行, false
		 */
		for (int j = 1; j <= sum; j ++) {
			dp[0][j] = false;
		}

		for (int i = 1; i <= n; i ++) {
			for (int j = 1; j <= sum; j ++) {
				if (j - nums[i - 1] >= 0) {
					dp[i][j] = dp[i - 1][j] || dp[i - 1][j - nums[i - 1]];
				} else {
					dp[i][j] = dp[i - 1][j];
				}
			}
		}
		return dp[n][sum];
	}

	/**
	 * solution2: dp + space compression
	 * @param nums
	 * @return
	 */
	public boolean canPartition3(int[] nums) {
		int sum = Arrays.stream(nums).sum();
		if (sum % 2 != 0) {
			return false;
		}
		sum /= 2;
		boolean[] dp = new boolean[sum + 1];
		dp[0] = true;
		for (int num : nums) {
			for (int j = sum; j >= num; j --) {
				dp[j] = dp[j] || dp[j - num];
			}
		}
		return dp[sum];
	}
}