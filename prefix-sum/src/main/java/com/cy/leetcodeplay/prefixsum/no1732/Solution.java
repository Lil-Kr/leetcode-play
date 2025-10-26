package com.cy.leetcodeplay.prefixsum.no1732;

/**
 * @Author: Lil-K
 * @Date: 2025/10/25
 * @Description: no.1732. Find the Highest Altitude
 * link: https://leetcode.com/problems/find-the-highest-altitude/description/
 *
 * todo: 未录入Anki
 */
public class Solution {

	public int largestAltitude(int[] gain) {
		int n = gain.length;

		int ans = 0;
		for (int i = 0, cur = 0; i < n; i ++) {
			cur += gain[i];
			ans = Math.max(ans, cur);
		}
		return ans;
	}
}