package com.cy.leetcodeplay.array.no238;

/**
 * @Author: Lil-K
 * @Date: 2024/10/22
 * @Description: no.238. Product of Array Except Self
 * 
 * 使用: 前缀积 和 后缀积
 * 
 * 1. 前缀积: 从左到右, 计算当前元素前面所有元素的乘积.
 * 2. 后缀积: 从右到左, 计算当前元素后面所有元素的乘积.
 * 3. 对于每个元素, 最终的乘积就是前缀积和后缀积的乘积.
 */
public class Solution {

	/**
	 *
	 * @param nums
	 * @return:
	 */
	public int[] productExceptSelf(int[] nums) {
		int n = nums.length;
		int[] res = new int[n];

		/**
		 * 前缀积: 首先计算左边所有元素的乘积
		 */
		res[0] = 1;
		for (int i = 1; i < n; i++) {
			res[i] = res[i - 1] * nums[i - 1];
		}

		/**
		 * 后缀积: 再从右边遍历, 同时计算右边所有元素的乘积
		 */
		int right = 1;
		for (int i = n - 1; i >= 0; i--) {
			res[i] = res[i] * right;
			right *= nums[i];
		}
		return res;
	}
}