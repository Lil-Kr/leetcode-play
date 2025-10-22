package com.cy.leetcodeplay.dpgroupallpackage.no377;

/**
 * @Author: Lil-K
 * @Date: 2025/9/27
 * @Description: no.377. Combination Sum IV
 * link: https://leetcode.com/problems/combination-sum-iv/description/
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
	public int combinationSum4(int[] nums, int target) {
		int[] dp = new int[target + 1];
		return f1(nums, target, dp);
	}

	private int f1(int[] nums, int target, int[] dp) {
		if (target == 0) {
			return 1;
		}
		if (target < 0) {
			return 0;
		}
		if (dp[target] != 0) {
			return dp[target];
		}

		int ans = 0;
		for (int i = 0; i < nums.length; i++) {
			ans += f1(nums, target - nums[i], dp);
		}
		dp[target] = ans;
		return ans;
	}

	/**
	 * solution2: dp
	 * @param nums
	 * @param target
	 * @return
	 */
	public int combinationSum4_2(int[] nums, int target) {
		int[] dp = new int[target + 1];
		dp[0] = 1;

		for (int i = 1; i <= target; i ++) {
			for (int num : nums) {
				if (i >= num) {
					dp[i] += dp[i - num];
				}
			}
		}
		return dp[target];
	}

}