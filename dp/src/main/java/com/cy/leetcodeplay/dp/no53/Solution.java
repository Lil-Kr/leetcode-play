package com.cy.leetcodeplay.dp.no53;

/**
 * @Author: Lil-K
 * @Date: 2024/11/1
 * @Description: no.53. Maximum Subarray
 * todo: 未录入题库
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
	 * 
	 * @param nums
	 * @return
	 */
	public int maxSubArray(int[] nums) {
		if (nums.length == 1) return nums[0];

		int maxSum = nums[0];
		int currentSum = nums[0];

		for (int i = 1; i < nums.length; i++) {
			currentSum = Math.max(nums[i], currentSum + nums[i]);
			maxSum = Math.max(maxSum, currentSum);
		}

		return maxSum;
	}
}