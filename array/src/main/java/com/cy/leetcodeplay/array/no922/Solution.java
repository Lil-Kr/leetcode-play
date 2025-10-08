package com.cy.leetcodeplay.array.no922;

/**
 * @Author: Lil-K
 * @Date: 2025/10/6
 * @Description: no.922. Sort Array By Parity II
 * link: https://leetcode.com/problems/sort-array-by-parity-ii/description/
 *
 * todo: 未录入Anki
 */
public class Solution {

	/**
	 * solution1
	 * @param nums
	 * @return
	 */
	public int[] sortArrayByParityII(int[] nums) {
		int n = nums.length;

		for (int even = 0, odd = 1; even < n && odd < n;) {
			if ((nums[n - 1] & 1) == 1) {
				swap(nums, odd, n - 1);
				odd += 2;
			} else {
				swap(nums, even, n - 1);
				even += 2;
			}
		}
		return nums;
	}

	private static void swap(int[] nums, int i, int j) {
		int temp = nums[i];
		nums[i] = nums[j];
		nums[j] = temp;
	}
}