package com.cy.leetcodeplay.dpintervals.no546;

/**
 * @Author: Lil-K
 * @Date: 2025/10/4
 * @Description: no.546. Remove Boxes
 * link: https://leetcode.com/problems/remove-boxes/description/
 *
 * todo: 未录入Anki
 */
public class Solution {

	/**
	 * solution1: recursive
	 * O(n^4)
	 * @param boxes
	 * @return
	 */
	public int removeBoxes(int[] boxes) {
		int n = boxes.length;
		int[][][] dp = new int[n][n][n];
		return f1(boxes, 0, n - 1, 0, dp);
	}

	private int f1(int[] boxes, int l, int r, int k, int[][][] dp) {
		if (l > r) return 0;

		if (dp[l][r][k] > 0) {
			return dp[l][r][k];
		}

		int s = l;
		while (s + 1 <= r && boxes[s] == boxes[s + 1]) {
			s ++;
		}
		int cnt = k + (s - l + 1);
		// case1: [2, 2, 2, 2, 3, 4, 4, 6]
		int ans = cnt * cnt + f1(boxes, s + 1, r, 0, dp);

		// case2: [2, 2, 2, 2, 3, 4, 4, 2, 6]
		for (int m = s + 2; m <= r; m ++) {
			if (boxes[l] == boxes[m] && boxes[m - 1] != boxes[m]) {
				ans = Math.max(ans, f1(boxes, s + 1, m - 1, 0, dp) + f1(boxes, m, r, cnt, dp));
			}
		}
		dp[l][r][k] = ans;
		return ans;
	}
}