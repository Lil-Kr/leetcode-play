package com.cy.leetcodeplay.greedy.no179;

import java.util.Arrays;

/**
 * @Author: Lil-K
 * @Date: 2025/10/23
 * @Description: no.179. Largest Number
 * link: https://leetcode.com/problems/largest-number/description/
 *
 * todo: 未录入Anki
 */
public class Solution {

	/**
	 * solution1:
	 * @param nums
	 * @return
	 */
	public String largestNumber(int[] nums) {
		int n = nums.length;
		String[] strs = Arrays.stream(nums).mapToObj(String::valueOf).toArray(String[]::new);
		for (int i = 0; i < n; i ++) {
			strs[i] = String.valueOf(nums[i]);
		}
		Arrays.sort(strs, (a, b) -> (b + a).compareTo(a + b));
		//
		if (strs[0].equals("0")) {
			return "0";
		}
		StringBuilder path = new StringBuilder();
		for (String s : strs) {
			path.append(s);
		}
		return path.toString();
	}
}