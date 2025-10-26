package com.cy.leetcodeplay.greedy.no134;

/**
 * @Author: Lil-K
 * @Date: 2025/10/25
 * @Description: no.134. Gas Station
 * link: https://leetcode.com/problems/gas-station/description/
 *
 * todo: 未录入Anki
 */
public class Solution {

	/**
	 * solution1: greedy
	 * @param gas
	 * @param cost
	 * @return
	 */
	public int canCompleteCircuit(int[] gas, int[] cost) {
		int n = gas.length;

		for (int l = 0, r = 0, sum; l < n; l = r + 1, r = l) {
			sum = 0;
			// 通过贪心 得到计算加速
			while (sum + gas[r % n] - cost[r % n] >= 0) {
				if (r - l + 1 == n) {
					return l;
				}
				sum += gas[r % n] - cost[r % n];
				r ++;
			}
		}
		return -1;
	}
}