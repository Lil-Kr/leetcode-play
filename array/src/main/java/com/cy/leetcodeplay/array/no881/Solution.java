package com.cy.leetcodeplay.array.no881;

import java.util.Arrays;

/**
 * @Author: Lil-K
 * @Date: 2025/10/7
 * @Description: no.881. Boats to Save People
 * link: https://leetcode.com/problems/boats-to-save-people/description/
 *
 * todo: 未录入Anki
 */
public class Solution {

	/**
	 * solution1
	 * @param people
	 * @param limit
	 * @return
	 */
	public int numRescueBoats(int[] people, int limit) {
		int n = people.length;

		Arrays.sort(people);
		int l = 0, r = n - 1;
		int ans = 0, sum = 0;
		while (l <= r) {
			sum = l == r ? people[l] : people[l] + people[r];
			if (sum > limit) {
				r --;
			} else {
				l ++;
				r --;
			}
			ans ++;
		}
		return ans;
	}
}