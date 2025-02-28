package com.cy.leetcodeplay.matrix.dp.no70;

import java.util.Arrays;

/**
 * @Author: Lil-K
 * @Date: 2024/11/2
 * @Description: no.70. Climbing Stairs
 * 题意: 爬楼梯, 给定n阶台阶, 可以每次上1阶台阶, 或者每次上2阶台阶, 爬完这n阶台阶, 有多少种方法
 *
 * todo: 未录入题库
 */
public class Solution {

	/**
	 * 记忆化搜索
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

	/**
	 * 解法二: 自底向上
	 * 到达每一阶的方法数只依赖于前两阶的和
	 * @param n
	 * @return
	 */
	public int climbStairs2(int n) {
		if (n <= 2) return n;

		int first = 1, second = 2;

		for (int i = 3; i <= n; i++) {
			int third = first + second;
			first = second;
			second = third;
		}
		return second;
	}

	/**
	 * 解法三: 动态规划
	 * @param n
	 * @return
	 */
	public int climbStairs3(int n) {
		int[] memo = new int[n + 1];
		Arrays.fill(memo, -1);

		memo[0] = 1;
		memo[1] = 1;

		for (int i = 2; i <= n; i++) {
			memo[i] = memo[i - 1] + memo[i - 2];
		}
		return memo[n];
	}

}