package com.cy.leetcodeplay.dp.fibonacci;

/**
 * @Author: Lil-K
 * @Date: 2024/11/2
 * @Description: 斐波那契额数列
 * link: https://leetcode.com/problems/fibonacci-number/description/
 */
public class Solution {

	/**
	 *
	 * @param n
	 * @return
	 */
	public int fib(int n) {
		if (n == 0) return 0;

		if (n == 1) return 1;

		return fib(n - 1) + fib(n - 2);
	}

	/**
	 * optimization: top -> down
	 * @param n
	 * @return
	 */
	public int fib2(int n, int[] memo) {
		if (n == 0) return 0;

		if (n == 1) return 1;

		if (memo[n] == -1) {
			memo[n] = fib2(n - 1, memo) + fib2(n - 2, memo);
		}

		return memo[n];
	}

	/**
	 * optimization: down -> top
	 * @param n
	 * @return
	 */
	public int fib3(int n) {

		int[] memo = new int[n + 1];
		memo[0] = 0;
		memo[1] = 1;
		for (int i = 2; i <= n; i ++) {
			memo[i] = memo[i - 1] + memo[i - 2];
		}

		return memo[n];
	}
}