package com.cy.leetcodeplay.dpmaxsubarraysum.no53;

import java.util.Arrays;

/**
 * @Author: Lil-K
 * @Date: 2024/11/1
 * @Description: no.53. Maximum Subarray
 * link: https://leetcode.com/problems/maximum-subarray/description/
 *
 * todo: 未录入Anki
 *
 * 动态规划:
 *
 * 使用一个变量 currentSum 来保存当前子数组和, 如果当前和 currentSum 小于 0, 则丢弃并重新开始一个新的子数组. 
 * 同时, 使用一个变量 maxSum 来保存当前找到的最大和. 
 * 具体步骤：
 *
 * 初始化 maxSum 为第一个元素, currentSum 也初始化为第一个元素. 
 * 从第二个元素开始遍历数组, 每次更新 currentSum：若 currentSum + nums[i] 更大, 则加上当前元素, 否则更新为 nums[i], 表示重新开始子数组. 
 * 将 currentSum 与 maxSum 比较并更新 maxSum.
 * 遍历结束后, maxSum 即为所求的最大子数组和.
 */
public class Solution {

	/**
	 * solution1: recursive
	 * @param nums
	 * @return
	 */
	public int maxSubArray(int[] nums) {
		return f1(nums, 0);
	}

	private int f1(int[] nums, int index) {
		if (index == nums.length) return Integer.MIN_VALUE;

		int curSum = 0;
		int maxSum = Integer.MIN_VALUE;

		for (int i = index; i < nums.length; i++) {
			curSum += nums[i];
			maxSum = Math.max(curSum, maxSum);
		}

		return Math.max(maxSum, f1(nums, index + 1));
	}

	/**
	 * solution2: 暴力解 + 记忆化
	 * 找到最小问题, 变量是 index
	 * @param nums
	 * @return
	 */
	public int maxSubArray2(int[] nums) {
		int n = nums.length;
		int[] dp = new int[n];
		Arrays.fill(dp, Integer.MIN_VALUE);

		return f2(nums, 0, dp);
	}

	private int f2(int[] nums, int index, int[] dp) {
		if (index == nums.length - 1) return nums[index];

		if (dp[index] != Integer.MIN_VALUE) {
			return dp[index];
		}

		dp[index] = Math.max(nums[index], f2(nums, index + 1, dp));

		return dp[index];
	}

	/**
	 * solution3: dp
	 * @param nums
	 * @return
	 */
	public int maxSubArray3(int[] nums) {
		int n = nums.length;
		int[] dp = new int[n];
		dp[0] = nums[0];

		int ans = nums[0];
		for (int i = 1; i < n; i++) {
			dp[i] = Math.max(nums[i], dp[i - 1] + nums[i]);
			ans = Math.max(ans, dp[i]);
		}
		return ans;
	}

	/**
	 * solution5: dp + space compression
	 * @param nums
	 * @return
	 */
	public int maxSubArray4(int[] nums) {
		int n = nums.length;
		int ans = nums[0];
		for (int i = 1, prevMax = nums[0]; i < n; i ++) {
			prevMax = Math.max(nums[i], prevMax + nums[i]);
			ans = Math.max(ans, prevMax);
		}
		return ans;
	}

	private static int left;
	private static int right;
	private static int sum;

	/**
	 * additional task: Find the subarray with the maximum sum and return the following three pieces of information
	 * 1. return the maximum subarray start index: left
	 * 2. return the maximum subarray end index: right
	 * 3. return the maximum subarray sum: sum
	 * @param nums
	 * @return
	 */
	public void extra(int[] nums) {
		int n = nums.length;
		sum = Integer.MIN_VALUE;
		for (int l = 0, r = 0, pre = Integer.MIN_VALUE; r < n; r ++) {
			if (pre >= 0) {
				pre += nums[r];
			} else {
				pre = nums[r];
				l = r;
			}
			if (pre > sum) {
				sum = pre;
				left = l;
				right = r;
			}
		}
	}

}