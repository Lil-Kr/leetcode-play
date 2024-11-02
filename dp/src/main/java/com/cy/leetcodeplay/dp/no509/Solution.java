package com.cy.leetcodeplay.dp.no509;

import java.util.Arrays;

/**
 * @Author: Lil-K
 * @Date: 2024/11/2
 * @Description: no.509. Fibonacci Number
 */
public class Solution {

	/**
	 *
	 * @param n
	 * @return
	 */
	public int fib(int n) {
		int[] memo = new int[n + 1];
		Arrays.fill(memo, -1);
		return fib(n, memo);


	}

	private int fib(int n, int[] memo) {
		if (n == 0) return 0;
		if (n == 1) return 1;

		if (memo[n] == -1) {
			memo[n] = fib(n - 1) + fib(n - 2);
		}

		return memo[n];
	}


	/**
	 * 解法二: 自底向上
	 * @param n
	 * @return
	 */
	public int fib2 (int n) {
		if (n == 0) return 0;
		if (n == 1) return 1;
		int[] memo = new int[n + 1];
		memo[1] = 1;

		for (int i = 2; i <= n; i++) {
			memo[i] = memo[i - 1] + memo[i - 2];
		}

		return memo[n];
	}

	/**
	 * 再优化
	 * @param n
	 * @return
	 */
	public int fib3 (int n) {
		if (n == 0) return 0;
		if (n == 1) return 1;

		int ll = 0, l = 1;
		int cur = 0;

		for (int i = 2; i <= n; i++) {
			cur = ll + l;
			ll = l;
			l = cur;
		}
		return l;
	}
}