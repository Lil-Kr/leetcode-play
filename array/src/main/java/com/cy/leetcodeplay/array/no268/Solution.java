package com.cy.leetcodeplay.array.no268;

import java.util.Arrays;

/**
 * @Author: Lil-K
 * @Date: 2024/8/30
 * @Description: no.268. Missing Number
 */
public class Solution {

	/**
	 *
	 * @param nums
	 * @return
	 */
	public int missingNumber(int[] nums) {
		int n = nums.length;

		int sum1 = (n + 1) * n / 2; // 高斯求和
		int sum2 = 0;
		for (int num : nums) {
			sum2 += num;
		}

		return sum1 - sum2;
	}

	/**
	 *
	 * @param nums
	 * @return
	 */
	public int missingNumber2(int[] nums) {
		int n = nums.length;

		int sum1 = (n + 1) * n / 2; // 高斯求和
		int sum2 = Arrays.stream(nums).sum();

		return sum1 - sum2;
	}
}
