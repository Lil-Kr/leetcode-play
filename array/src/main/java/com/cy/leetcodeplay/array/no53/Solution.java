package com.cy.leetcodeplay.array.no53;

/**
 * @Author: Lil-K
 * @Date: 2024/10/23
 * @Description: no.53. Maximum Subarray
 * todo: 未录入题库
 */
public class Solution {

	/**
	 *
	 * @param nums
	 * @return
	 */
	public int maxSubArray(int[] nums) {
		// 初始化两个变量：当前子数组和，最大和
		int currentSum = nums[0];
		int maxSum = nums[0];

		// 遍历数组从第二个元素开始
		for (int i = 1; i < nums.length; i++) {
			// 如果当前子数组和小于 0，则从当前元素重新开始
			currentSum = Math.max(nums[i], currentSum + nums[i]);
			// 更新最大和
			maxSum = Math.max(maxSum, currentSum);
		}

		return maxSum;
	}
}