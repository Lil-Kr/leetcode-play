package com.cy.leetcodeplay.matrix.dp.no639;

import java.util.Arrays;

/**
 * @Author: Lil-K
 * @Date: 2024/11/5
 * @Description: no.639. Decode Ways II
 * link: https://leetcode.com/problems/decode-ways-ii/
 *
 * todo: 未录入题库
 */
public class Solution {

	private long MOD = (int) Math.pow(10, 9) + 7;

	/**
	 * 解法一: 暴力递归
	 * 这个版本不是完整的代码, 没有做取余的操作
	 * @param s
	 * @return
	 */
	public int numDecodings(String s) {
		return f1(s.toCharArray(), 0);
	}

	private int f1(char[] s, int i) {
		if (i == s.length) return 1;

		/**
		 * 1. 0 的情况
		 */
		if (s[i] == '0') {
			return 0;
		}

		/**
		 * 2. f(i) + f(i + 1), [number], [*], [0]
		 */
		int res = (s[i] == '*' ? 9 : 1) * f1(s, i + 1);

		/**
		 * 3. f(i + i+1), + f(i + 2),  [number, number], [number, *], [*, number],
		 * i, i + 1 一起转的case
		 */
		if (i + 1 >= s.length) {
			return  res;
		}

		if (s[i] != '*') { // i 是数字
			if (s[i + 1] != '*') { // [number, number]
				if (i + 1 < s.length && ((s[i] - '0') * 10 + (s[i + 1] - '0')) <= 26) {
					res += f1(s, i + 2);
				}
			} else { // i + 1 == *
				if (s[i] == '1') {
					res += 9 * f1(s, i + 2);
				}

				if (s[i] == '2') {
					res += 6 * f1(s, i + 2);
				}
			}
		} else { // i == *
			if (s[i + 1] != '*') { // [*, number]
				if (s[i + 1] <= '6') {
					res += 2 * f1(s, i + 2);
				} else if (s[i + 1] > '6') {
					res += f1(s, i + 2);
				} else {
					res += 0;
				}
			} else { // [*, *]
				res += 15 * f1(s, i + 2);
			}
		}
		return res;
	}

	/**
	 * 解法二: 递归 + 记忆化搜索
	 * @param s
	 * @return
	 */
	public int numDecodings2(String s) {
		char[] chars = s.toCharArray();
		long[] dp = new long[chars.length];
		Arrays.fill(dp, -1);
		return (int)f2(chars, 0, dp);
	}

	private long f2(char[] s, int i, long[] dp) {
		if (i == s.length) return 1;

		/**
		 * 1. 0 的情况
		 */
		if (s[i] == '0') {
			return 0;
		}

		/**
		 * 设置 dp 表
		 */
		if (dp[i] != -1) return dp[i];

		/**
		 * 2. f(i) + f(i + 1), [number], [*], [0]
		 */
		long res = (s[i] == '*' ? 9 : 1) * f2(s, i + 1, dp);

		/**
		 * 3. f(i + i+1), + f(i + 2),  [number, number], [number, *], [*, number],
		 * i, i + 1 一起转的case
		 */
		if (i + 1 >= s.length) {
			return  res;
		}

		if (s[i] != '*') { // i 是数字
			if (s[i + 1] != '*') { // [number, number]
				if (i + 1 < s.length && ((s[i] - '0') * 10 + (s[i + 1] - '0')) <= 26) {
					res += f2(s, i + 2, dp);
				}
			} else { // i + 1 == *
				if (s[i] == '1') {
					res += 9 * f2(s, i + 2, dp);
				}

				if (s[i] == '2') {
					res += 6 * f2(s, i + 2, dp);
				}
			}
		} else { // i == *
			if (s[i + 1] != '*') { // [*, number]
				if (s[i + 1] <= '6') {
					res += 2 * f2(s, i + 2, dp);
				} else if (s[i + 1] > '6') {
					res += f2(s, i + 2, dp);
				} else {
					res += 0;
				}
			} else { // [*, *]
				res += 15 * f2(s, i + 2, dp);
			}
		}

		dp[i] = res % MOD;
		return dp[i];
	}

	/**
	 * 解法三: 动态规划 + db表
	 * @param s
	 * @return
	 */
	public int numDecodings3(String s) {
		char[] chars = s.toCharArray();
		int n = chars.length;
		long[] dp = new long[n + 1];
		dp[n] = 1;

		for (int i = n - 1; i >= 0; i--) {
			if (chars[i] != '0') {
				dp[i] = (chars[i] == '*' ? 9 : 1) * dp[i + 1];
				if (i + 1 < n) {
					if (chars[i] != '*') { // i 是数字
						if (chars[i + 1] != '*') { // [number, number]
							if (((chars[i] - '0') * 10 + (chars[i + 1] - '0')) <= 26) {
								dp[i] += dp[i + 2];
							}
						} else { // i + 1 == *
							if (chars[i] == '1') {
								dp[i] += 9 * dp[i + 2];
							}

							if (chars[i] == '2') {
								dp[i] += 6 * dp[i + 2];
							}
						}
					} else { // i == *
						if (chars[i + 1] != '*') { // [*, number]
							if (chars[i + 1] <= '6') {
								dp[i] += 2 * dp[i + 2];
							} else if (chars[i + 1] > '6') {
								dp[i] += dp[i + 2];
							}
						} else { // [*, *]
							dp[i] += 15 * dp[i + 2];
						}
					}
				}
				dp[i] = dp[i] % MOD;
			}
		}
		return (int)dp[0];
	}

	/**
	 * 动态规划 + 去除 dp表
	 * @param s
	 * @return
	 */
	public int numDecodings4(String s) {
		char[] chars = s.toCharArray();
		int n = chars.length;

		long next = 1, nextNext = 0;
		long cur = 0;

		for (int i = n - 1; i >= 0; i--) {
			if (chars[i] != '0') {
				cur = (chars[i] == '*' ? 9 : 1) * next;
				if (i + 1 < n) {
					if (chars[i] != '*') { // i 是数字
						if (chars[i + 1] != '*') { // [number, number]
							if (((chars[i] - '0') * 10 + (chars[i + 1] - '0')) <= 26) {
								cur += nextNext;
							}
						} else { // i + 1 == *
							if (chars[i] == '1') {
								cur += 9 * nextNext;
							}

							if (chars[i] == '2') {
								cur += 6 * nextNext;
							}
						}
					} else { // i == *
						if (chars[i + 1] != '*') { // [*, number]
							if (chars[i + 1] <= '6') {
								cur += 2 * nextNext;
							} else if (chars[i + 1] > '6') {
								cur += nextNext;
							}
						} else { // [*, *]
							cur += 15 * nextNext;
						}
					}
				}
				cur %= MOD;
			}
			nextNext = next;
			next = cur;
			cur = 0;
		}
		return (int)next;
	}
}