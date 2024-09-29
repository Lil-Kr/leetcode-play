package com.cy.leetcodeplay.array.no66;

/**
 * @Author: Lil-K
 * @Date: 2024/9/29
 * @Description: no.66. Plus One
 */
public class Solution {


	public int[] plusOne(int[] digits) {
		int n = digits.length - 1;

		for (int i = n; i >= 0; i--) {
			if (digits[i] < 9) {
				digits[i]++;
				return digits;
			}
			digits[i] = 0;
		}

		// 如果所有数字都进位了, 最高位就为1
		int[] res = new int[digits.length + 1];
		res[0] = 1;
		return res;
	}
}