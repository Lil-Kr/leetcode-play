package com.cy.leetcodeplay.matrix.findtable.no41;

/**
 * @Author: Lil-K
 * @Date: 2024/11/1
 * @Description: no.41. First Missing Positive
 * todo: 未录入题库
 *
 * 题意: 给定一个未排序的整数数组 nums，找出数组中缺失的第一个正整数。
 *
 */
public class Solution {

	/**
	 *
	 * @param nums
	 * @return
	 */
	public int firstMissingPositive(int[] nums) {

		int n = nums.length;

		for (int i = 0; i < n; i++) {
			// 把 nums[i] 放到正确的位置上, 即 nums[nums[i] - 1]
			while (nums[i] > 0 && nums[i] <= n && nums[i] != nums[nums[i] - 1]) {
				int correctIndex = nums[i] - 1;
				// 交换 nums[i] 和 nums[correctIndex]
				int temp = nums[i];
				nums[i] = nums[correctIndex];
				nums[correctIndex] = temp;
			}
		}
		
		/**
		 * 遍历找到第一个不满足 nums[i] == i + 1 的位置
		 */
		for (int i = 0; i < n; i++) {
			if (nums[i] != i + 1) {
				return i + 1;
			}
		}

		/**
		 * 如果都符合 nums[i] == i + 1, 则返回 n + 1
		 */
		return n + 1;
	}
}