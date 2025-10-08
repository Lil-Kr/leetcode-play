package com.cy.leetcodeplay.array.no41;

/**
 * @Author: Lil-K
 * @Date: 2025/4/10
 * @Description: no.41. First Missing Positive
 * link: https://leetcode.com/problems/first-missing-positive
 *
 * 原地哈希:
 *  1. 将数组中的数放到对应的位置上
 */
public class Solution {

	/**
	 * solution1:
	 * @param nums
	 * @return
	 */
	public int firstMissingPositive(int[] nums) {
		int n = nums.length;

		for (int i = 0; i < n; i++) {
			/**
			 * 当 nums[i] 在 [1, n] 范围内, 且 nums[i] 不在正确的位置时, 交换
			 * 如果存在 -1
			 */
			while (nums[i] > 0 && nums[i] <= n && nums[i] != nums[nums[i] - 1]) {
				// 交换 nums[i] 和 nums[correctIndex]
				int correctIndex = nums[i] - 1;
				swap(nums, correctIndex, i);
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

	/**
	 * solution2:
	 * @param nums
	 * @return
	 */
	public int firstMissingPositive2(int[] nums) {
		/**
		 * l: l的左边都放 l + 1 的数, 一直观察 nums[l] 位置的值
		 */
		int l = 0, r = nums.length;
		while (l < r) {
			if (nums[l] == l + 1) {
				l ++;
			} else if (nums[l] <= l || nums[l] > r || nums[nums[l] - 1] == nums[l]) {
				r --;
				swap(nums, l, r);
			} else {
				swap(nums, l, nums[l] - 1);
			}
		}
		return  l + 1;
	}

	private void swap(int[] nums, int i, int j) {
		int temp = nums[i];
		nums[i] = nums[j];
		nums[j] = temp;
	}
}