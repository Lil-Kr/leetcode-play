package com.cy.leetcodeplay.math.no263;

/**
 * @Author: Lil-K
 * @Date: 2024/11/8
 * @Description: no.263. Ugly Number
 * link: https://leetcode.com/problems/ugly-number/description/
 *
 * todo: 未录入Anki
 */
public class Solution {

	/**
	 *
	 * @param n
	 * @return
	 */
	public boolean isUgly(int n) {
		if (n <= 0) return false;

		int[] factors = {2, 3, 5};

		for (int factor : factors) {
			while (n % factor == 0) {
				n /= factor;
			}
		}
		return n == 1;
	}
}