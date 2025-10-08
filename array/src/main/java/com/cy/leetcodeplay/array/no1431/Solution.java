package com.cy.leetcodeplay.array.no1431;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: Lil-K
 * @Date: 2025/10/5
 * @Description: 1431. Kids With the Greatest Number of Candies
 * link: https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/description/
 *
 * todo: 未录入Anki
 */
public class Solution {

	/**
	 *
	 * @param candies
	 * @param extraCandies
	 * @return
	 */
	public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
		int n = candies.length;
		int max = Integer.MIN_VALUE;
		for (int candy : candies) {
			max = Math.max(max, candy);
		}

		List<Boolean> res = new ArrayList<>();
		for (int i = 0; i < n; i ++) {
			if (candies[i] + extraCandies >= max) {
				res.add(true);
			} else {
				res.add(false);
			}
		}
		return res;
	}
}