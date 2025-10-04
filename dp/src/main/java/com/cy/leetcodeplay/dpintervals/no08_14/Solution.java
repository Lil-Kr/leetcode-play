package com.cy.leetcodeplay.dpintervals.no08_14;

/**
 * @Author: Lil-K
 * @Date: 2025/10/3
 * @Description: no.面试题 08.14. 布尔运算
 * link: https://leetcode.cn/problems/boolean-evaluation-lcci/description/
 *
 * todo: 未录入Anki
 */
public class Solution {

	/**
	 * solution1: recursive
	 * @param str
	 * @param result
	 * @return
	 */
	public int countEval(String str, int result) {
		char[] s = str.toCharArray();
		int n = s.length;

		int[][][] dp = new int[n][n][];
		int [] ft = f1(s, 0, n - 1, dp);
		return ft[result];
	}

	/**
	 *
	 * @param s
	 * @param l
	 * @param r
	 * @return int[] res
	 *  1. res[0] = false 的数量
	 *  2. res[1] = true 的数量
	 */
	private int[] f1(char[] s, int l, int r, int[][][] dp) {
		if (dp[l][r] != null) {
			return dp[l][r];
		}
		int f = 0;
		int t = 0;
		if (l == r) {
			f = s[l] == '0' ? 1 : 0;
			t = s[l] == '1' ? 1 : 0;
		} else {
			int[] temp;
			// k 为 当前逻辑运算符的位置
			for (int k = l + 1, a, b, c, d; k < r; k += 2) {
				temp = f1(s, l, k - 1, dp);
				a = temp[0];
				b = temp[1];

				temp = f1(s, k + 1, r, dp);
				c = temp[0];
				d = temp[1];

				if (s[k] == '&') {
					f += a * c + a * d + b * c;
					t += b * d;
				} else if (s[k] == '|') {
					f += a * c;
					t += a * d + b * c + b * d;
				} else { // s[k] == '^'
					f += a * c + b * d;
					t += a * d + b * c;
				}
			}
		}
		int[] ans = new int[]{f, t};
		dp[l][r] = ans;
		return ans;
	}
}