package com.cy.leetcodeplay.array.no643;

/**
 * @Author: Lil-K
 * @Date: 2025/9/1
 * @Description: no.643. Maximum Average Subarray I
 * link: https://leetcode.com/problems/maximum-average-subarray-i/description/
 *
 * todo: 未录入Anki
 * Sliding Window
 */
public class Solution {

	/**
	 * Sliding Window
	 * @param nums
	 * @param k
	 * @return
	 */
	public double findMaxAverage(int[] nums, int k) {
		int n = nums.length;
		double sum = 0, maxSum = 0;
		for (int i = 0; i < k; i++) {
			sum += nums[i];
		}
		maxSum = sum;

		for (int i = k; i < n; i ++) {
			sum += nums[i] - nums[i - k];
			maxSum = Math.max(sum, maxSum);
		}

		return maxSum / k;
	}
}