package com.cy.leetcodeplay.matrix.dp.fibonacci;

import java.util.Arrays;

/**
 * @Author: Lil-K
 * @Date: 2024/11/2
 * @Description: 斐波那契额数列
 */
public class Solution {

	private int num = 0;

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	/**
	 *
	 * @param n
	 * @return
	 */
	public int fib(int n) {
		setNum(num+1);
		if (n == 0) return 0;

		if (n == 1) return 1;

		return fib(n - 1) + fib(n - 2);
	}

	/**
	 * 优化
	 * @param n
	 * @return
	 */
	public int fib2(int n, int[] memo) {
		setNum(num+1);

		if (n == 0) return 0;

		if (n == 1) return 1;

		if (memo[n] == -1) {
			memo[n] = fib2(n - 1, memo) + fib2(n - 2, memo);
		}

		return memo[n];
	}

	public static void main(String[] args) {
		int n = 1000;
		int[] memo = new int[n + 1];
		Arrays.fill(memo, -1);

		Solution s = new Solution();
		int res = s.fib2(n, memo);
		System.out.println(res);

		System.out.println(s.getNum());
	}
}