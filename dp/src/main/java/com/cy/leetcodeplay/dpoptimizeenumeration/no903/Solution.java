package com.cy.leetcodeplay.dpoptimizeenumeration.no903;

/**
 * @Author: Lil-K
 * @Date: 2025/10/12
 * @Description: no.903. Valid Permutations for DI Sequence
 * link: https://leetcode.com/problems/valid-permutations-for-di-sequence/description/
 *
 * todo: 未录入Anki
 */
public class Solution {

	private static int mod = (int)Math.pow(10, 9) + 7;

	/**
	 * solution1: recursive
	 * @param str
	 * @return
	 */
	public int numPermsDISequence(String str) {
		int n = str.length() + 1;
		return f1(str.toCharArray(), 0, n, n);
	}

	/**
	 *
	 * @param s
	 * @param i
	 * @param less 初始化时认为所有的数字都比无穷大小
	 * @param n 一共n个数字
	 * @return f1(i, less) 后续还有多少种排列
	 */
	private int f1(char[] s, int i, int less, int n) {
		int ans = 0;
		// 越界, 说明之前数字都确定了, 并且每一步都符合 s 中的范式, 算作1种可能性
		if (i == n) {
			ans = 1;
		} else if (i == 0 || s[i - 1] == 'D') {
			for (int nextLess = 0; nextLess < less; nextLess ++) {
				ans += f1(s, i + 1, nextLess, n);
			}
		} else { // s[i - 1] == 'I'
			for (int nextLess = less; nextLess < n - i; nextLess ++) {
				ans += f1(s, i + 1, nextLess, n);
			}
		}
		return ans;
	}

	/**
	 * solution2: dp
	 * @param str
	 * @return
	 */
	public int numPermsDISequence2(String str) {
		int n = str.length() + 1;
		char[] s = str.toCharArray();

		int[][] dp = new int[n + 1][n + 1];
		for (int less = 0; less <= n; less ++) {
			dp[n][less] = 1;
		}
		for (int i = n - 1; i >= 0; i --) {
			for (int less = 0; less <= n; less ++) {
				if (i == 0 || s[i - 1] == 'D') {
					for (int nextLess = 0; nextLess < less; nextLess ++) {
						dp[i][less] = (dp[i][less] + dp[i + 1][nextLess]) % mod;
					}
				} else {
					for (int nextLess = less, k = 1; k <= n - i - less; k ++, nextLess ++) {
						dp[i][less] = (dp[i][less] + dp[i + 1][nextLess]) % mod;
					}
				}
			}
		}
		return dp[0][n];
	}

	/**
	 * solution3:
	 * 优化枚举
	 * @param str
	 * @return
	 */
	public int numPermsDISequence3(String str) {
		int n = str.length() + 1;
		char[] s = str.toCharArray();

		int[][] dp = new int[n + 1][n + 1];
		for (int less = 0; less <= n; less ++) {
			dp[n][less] = 1;
		}

		for (int i = n - 1; i >= 0; i --) {
			if (i == 0 || s[i - 1] == 'D') {
				dp[i][1] = dp[i + 1][0];
				for (int less = 2; less <= n; less ++) {
					dp[i][less] = (dp[i][less - 1] + dp[i + 1][less - 1]) % mod;
				}
			} else {
				dp[i][n - i - 1] = dp[i + 1][n - i - 1];
				for (int less = n - i - 2; less >= 0; less --) {
					dp[i][less] = (dp[i][less + 1] + dp[i + 1][less]) % mod;
				}
			}
		}
		return dp[0][n];
	}

}