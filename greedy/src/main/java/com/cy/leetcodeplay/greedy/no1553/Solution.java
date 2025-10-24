package com.cy.leetcodeplay.greedy.no1553;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: Lil-K
 * @Date: 2025/10/23
 * @Description: no.1553. Minimum Number of Days to Eat N Oranges
 * link: https://leetcode.com/problems/minimum-number-of-days-to-eat-n-oranges/description/
 *
 * todo: 未录入Anki
 */
public class Solution {

	private static Map<Integer, Integer> dp = new HashMap<>();

	/**
	 * solution1: greedy
	 * @param n
	 * @return
	 */
	public int minDays(int n) {
		if (n <= 1) {
			return n;
		}

		if (dp.containsKey(n)) {
			return dp.get(n);
		}

		int ans = Math.min(n % 2 + 1 + minDays(n / 2), n % 3 + 1 + minDays(n / 3));
		dp.put(n, ans);
		return ans;
	}
}