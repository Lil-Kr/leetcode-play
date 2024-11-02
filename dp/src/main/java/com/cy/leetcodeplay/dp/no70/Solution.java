package com.cy.leetcodeplay.dp.no70;

import java.util.Arrays;

/**
 * @Author: Lil-K
 * @Date: 2024/11/2
 * @Description: no.70. Climbing Stairs
 */
public class Solution {

	/**
	 *
	 * @param n
	 * @return
	 */
	public int climbStairs(int n) {
		int[] memo = new int[n + 1];
		Arrays.fill(memo, -1);
		return climbing(n, memo);
	}

	private int climbing(int n, int[] memo) {
		// if (n == 0 || n == 1) return 1;
		if (n == 1) return 1;
		if (n == 2) return 2;

		if (memo[n] == -1) {
			memo[n] = climbing(n - 1, memo) + climbing(n - 2, memo);
		}
		return memo[n];
	}
}