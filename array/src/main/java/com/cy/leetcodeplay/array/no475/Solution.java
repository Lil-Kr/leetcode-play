package com.cy.leetcodeplay.array.no475;

import java.util.Arrays;

/**
 * @Author: Lil-K
 * @Date: 2025/10/7
 * @Description: no.475. Heaters
 * link: https://leetcode.com/problems/heaters/
 *
 * todo: 未录入Anki
 */
public class Solution {

	/**
	 * solution1:
	 * @param houses
	 * @param heaters
	 * @return
	 */
	public int findRadius(int[] houses, int[] heaters) {
		Arrays.sort(houses);
		Arrays.sort(heaters);
		int n = houses.length;

		int ans = Integer.MIN_VALUE;
		for (int i = 0, j = 0; i < n; i ++) {
			while (!best(houses, heaters, i, j)) {
				j ++;
			}
			ans = Math.max(ans, Math.abs(heaters[j] - houses[i]));
		}
		return ans;
	}

	private boolean best(int[] houses, int[] heaters, int i, int j) {
		// j 在最后一个位置说明已经是最优供暖器的位置
		return j == heaters.length - 1 || Math.abs(heaters[j] - houses[i]) < Math.abs(heaters[j + 1] - houses[i]);
	}

}