package com.cy.leetcodeplay.dp01package.no494;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

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
	 * solution1: recursive
	 * @param nums
	 * @param target
	 * @return
	 */
	public int findTargetSumWays(int[] nums, int target) {
		Map<Integer, Integer> dp = new HashMap<>();
		return f1(nums, target, 0, 0, dp);
	}

	private int f1(int[] nums, int target, int i, int sum, Map<Integer, Integer> dp) {
		if (i == nums.length) return sum == target ? 1 : 0;
		return f1(nums, target, i + 1, sum + nums[i], dp) + f1(nums, target, i + 1, sum - nums[i], dp);
	}

	/**
	 * solution2: dp
	 * @param nums
	 * @param target
	 * @return
	 */
	public int findTargetSumWays2(int[] nums, int target) {
		int n = nums.length;
		int sum = Arrays.stream(nums).sum();
		if (target > sum || target < -sum) return 0;

		int m = 2 * sum + 1;
		int[][] dp = new int[n + 1][m];
		dp[n][target + sum] = 1;
		for (int i = n - 1; i >= 0; i --) {
			for (int j = -sum; j <= sum; j ++) {
				if (j + nums[i] + sum < m) {
					dp[i][j + sum] = dp[i + 1][j + nums[i] + sum];
				}
				if (j - nums[i] + sum >= 0) {
					dp[i][j + sum] += dp[i + 1][j - nums[i] + sum];
				}
			}
		}
		return dp[0][sum];
	}

	/**
	 * solution3: dp
	 * 0-1 package question
	 * @param nums
	 * @param target
	 * @return
	 */
	public int findTargetSumWays3(int[] nums, int target) {
		int n = nums.length;
		int sum = Arrays.stream(nums).sum();

		if (target > sum || target < -sum) return 0;
		if ((sum - target) % 2 != 0) return 0;

		int sum2 = (sum - target) / 2;

		int m = sum2 + 1;
		int[][] dp = new int[n + 1][m];
		dp[0][0] = 1;

		for (int i = 1; i <= n; i ++) {
			for (int j = 0; j <= sum2; j ++) {
				dp[i][j] = dp[i - 1][j];
				if (j - nums[i - 1] >= 0) {
					dp[i][j] += dp[i - 1][j - nums[i - 1]];
				}
			}
		}
		return dp[n][m - 1];
	}

	/**
	 * solution4: dp + space compression
	 * @param nums
	 * @param target
	 * @return
	 */
	public int findTargetSumWays4(int[] nums, int target) {
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
		// 空集算为1个
		dp[0] = 1;
		for (int num : nums) { // 省略 i 变量
			for (int j = sum2; j >= num; j --) {
				dp[j] += dp[j - num];
			}
		}
		return dp[sum2];
	}
}