package com.cy.leetcodeplay.dpmaxsubarraysum.no740;

import java.util.Arrays;

/**
 * @Author: Lil-K
 * @Date: 2025/10/22
 * @Description: no.740. Delete and Earn
 * link: https://leetcode.com/problems/delete-and-earn/
 *
 * todo: 未录入Anki
 */
public class Solution {

	/**
	 * solution1: dp
	 * @param nums
	 * @return
	 */
	public int deleteAndEarn(int[] nums) {
		if (nums.length == 0) return 0;

		int maxVal = Arrays.stream(nums).max().getAsInt();

		int[] points = new int[maxVal + 1];
		for (int num : nums) {
			points[num] += num;
		}

		int[] dp = new int[maxVal + 1];
		dp[1] = points[1];
		for (int i = 2; i <= maxVal; i++) {
			dp[i] = Math.max(dp[i - 1], dp[i - 2] + points[i]);
		}
		return dp[maxVal];
	}

	/**
	 * solution2: dp + space compression
	 * @param nums
	 * @return
	 */
	public int deleteAndEarn2(int[] nums) {
		if (nums.length == 0) return 0;

		int maxVal = Arrays.stream(nums).max().getAsInt();

		int[] points = new int[maxVal + 1];
		for (int num : nums) {
			points[num] += num;
		}

		int prepre = 0, pre = points[1];
		for (int i = 2, cur; i <= maxVal; i++) {
			cur = Math.max(pre, prepre + points[i]);
			prepre = pre;
			pre = cur;
		}
		return pre;
	}
}