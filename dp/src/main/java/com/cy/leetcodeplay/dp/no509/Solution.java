package com.cy.leetcodeplay.dp.no509;

import java.util.Arrays;

/**
 * @Author: Lil-K
 * @Date: 2024/11/2
 * @Description: no.509. Fibonacci Number
 * link: https://leetcode.com/problems/fibonacci-number/description/
 *
 * todo: 未录入Anki
 */
public class Solution {

	/**
	 * solution1: top to down (自顶向下)
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
	 * solution2: down to top (自底向上)
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
	 * solution3: dynamic programming
	 * @param n
	 * @return
	 */
	public int fib3 (int n) {
		if (n == 0) return 0;
		int[] dp = new int[n + 1];
		dp[0] = 0;
		dp[1] = 1;
		for (int i = 2; i <= n; i ++) {
			dp[i] = dp[i - 1] + dp[i - 2];
		}
		return dp[n];
	}

	/**
	 * solution4: don`t need dp table
	 * O(log n)
	 * @param n
	 * @return
	 */
	public int fib4 (int n) {
		if (n == 0 || n == 1) return n;
		int lastLast = 0, last = 1;
		for (int i = 2, cur; i <= n; i ++) {
			cur = lastLast + last;
			lastLast = last;
			last = cur;
		}
		return last;
	}
}