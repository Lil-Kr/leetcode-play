package com.cy.leetcodeplay.dplis.no673;

import java.util.Arrays;

/**
 * @Author: Lil-K
 * @Date: 2025/10/21
 * @Description: 673. Number of Longest Increasing Subsequence
 * link: https://leetcode.com/problems/number-of-longest-increasing-subsequence/
 *
 * todo: 未录入Anki
 */
public class Solution {

	/**
	 * solution1:
	 * @param nums
	 * @return
	 */
	public int findNumberOfLIS(int[] nums) {
		int n = nums.length;
		if (n == 0) return 0;

		// dp[i]: 以 nums[i] 结尾的 LIS 长度
		int[] dp = new int[n];

		// count[i]: 对应的方案数量
		int[] count = new int[n];

		Arrays.fill(dp, 1);
		Arrays.fill(count, 1);

		// 全局最大长度
		int ans = 1;
		for (int i = 0; i < n; i ++) {
			for (int j = 0; j < i; j ++) {
				if (nums[i] <= nums[j]) {
					continue;
				}

				if (dp[j] + 1 > dp[i]) {
					dp[i] = dp[j] + 1;
					count[i] = count[j];
				} else if (dp[j] + 1 == dp[i]) {
					count[i] += count[j];
				}
			}
			// 每次更新最大值
			ans = Math.max(ans, dp[i]);
		}

		// 汇总结果
		int res = 0;
		for (int i = 0; i < n; i ++) {
			if (dp[i] == ans) {
				res += count[i];
			}
		}
		return res;
	}
}