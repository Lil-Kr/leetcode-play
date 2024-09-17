package com.cy.leetcodeplay.array.no303;

/**
 * @Author: Lil-K
 * @Date: 2024/8/29
 * @Description: no.303. Range Sum Query - Immutable
 */
public class NumArray {

	private int[] prefixSum;

	public NumArray() {
	}

	public NumArray(int[] nums) {
		// 初始化前缀和数组
		prefixSum = new int[nums.length + 1];
		for (int i = 0; i < nums.length; i++) {
			prefixSum[i + 1] = prefixSum[i] + nums[i];
		}
	}

	public int sumRange(int left, int right) {
		return prefixSum[right + 1] - prefixSum[left];
	}
}
