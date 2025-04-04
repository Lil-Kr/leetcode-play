package com.cy.leetcodeplay.array.no31;

/**
 * @Author: Lil-K
 * @Date: 2025/3/27
 * @Description: no.31. Next Permutation
 * link: https://leetcode.com/problems/next-permutation/description
 */
public class Solution {

	/**
	 * 解题思路：
	 * 1. 从右往左找到第一个下降的元素 nums[i]
	 *    - 即找到 nums[i] < nums[i+1] 的位置, 记作 pivot.
	 *    - 如果找不到 (说明是降序排列),直接反转整个数组得到最小排列.
	 *
	 * 2. 从右往左找到第一个比 nums[i] 大的元素 nums[j]
	 *    - 在 nums[i+1] ~ nums[n-1] 之间，找到 nums[j]，使 nums[j] > nums[i].
	 *    - 交换 nums[i] 和 nums[j]，保证排列变大但尽可能小.
	 *
	 * 3. 反转 nums[i+1] ~ nums[n-1]
	 *    - 由于 nums[i+1] ~ nums[n-1] 原本是降序的，交换后仍是降序.
	 *    - 直接反转，使其变为最小排列（升序）.
	 *
	 * 复杂度分析：
	 * - 时间复杂度：O(n)，最多三次遍历（找 i、找 j、反转）.
	 * - 空间复杂度：O(1)，原地修改，不使用额外空间.
	 * @param nums
	 */
	public void nextPermutation(int[] nums) {
		int n = nums.length;
		int i = n - 2;

		// 1. 从右往左寻找到第一个下降的元素 nums[i]
		while (i >= 0 && nums[i] >= nums[i + 1]) {
			i--;
		}

		// 如果整个数组都是降序的, i < 0, 不会进入 if 判断
		if (i >= 0) {
			int j = n - 1;
			// 2. 从右往左找到第一个比 nums[i] 大的元素 nums[j]
			while (nums[j] <= nums[i]) {
				j--;
			}
			swap(nums, i, j);
		}
		// 反转 nums[i + 1] ~ nums[n - 1]
		reverse(nums, i + 1, n - 1);
	}

	private void swap(int[] nums, int i, int j) {
		int temp = nums[i];
		nums[i] = nums[j];
		nums[j] = temp;
	}

	private void reverse(int[] nums, int start, int end) {
		while (start < end) {
			swap(nums, start, end);
			start++;
			end--;
		}
	}
}
