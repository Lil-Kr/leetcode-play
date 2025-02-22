package com.cy.leetcodeplay.array.no167;

/**
 * @Author: Lil-K
 * @Date: 2025/2/22
 * @Description: Two Sum II - Input Array Is Sorted
 *
 * link: https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/description/
 */
public class Solution {

	public static int[] twoSum(int[] numbers, int target) {
		if (numbers.length < 2) return new int[]{0, 0};

		int l = 0, r = numbers.length - 1;

		while (true) {
			if (l >= r) {
				return new int[]{0, 0};
			}

			if (numbers[l] + numbers[r] == target) {
				return new int[]{l+1, r+1};
			} else if (numbers[l]+ numbers[r] < target) {
				l++;
			} else {
				r--;
			}
		}
	}
}
