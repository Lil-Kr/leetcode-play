package com.cy.leetcodeplay.array.no485;

/**
 * @Author: Lil-K
 * @Date: 2024/8/31
 * @Description:
 */
public class Solution {

	public static void main(String[] args) {
		int[] nums = new int[]{1, 1, 0, 1, 1, 1};
		int maxConsecutiveOnes = findMaxConsecutiveOnes(nums);
		System.out.println(maxConsecutiveOnes);
	}

	public static int findMaxConsecutiveOnes(int[] nums) {
		if (nums.length == 1) return nums[0] == 0 ? 0 : 1;

		int maxLength = 0, count = 0;

		int l = 0, r = 0; // nums[l ... r] == 1
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 0) {
				count = 0;
				continue;
			}

			count++;
			maxLength = Math.max(count, maxLength);
		}
		return maxLength;
	}
}
