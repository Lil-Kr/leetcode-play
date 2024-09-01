package com.cy.leetcodeplay.array.no696;

/**
 * @Author: Lil-K
 * @Date: 2024/9/1
 * @Description:
 */
public class Solution {

	/**
	 * arr[0, 0, 1, 1, 0, 0, 1, 1]
	 * 00110011
	 * @param s
	 * @return
	 */
	public static int countBinarySubstrings(String s) {
		int prev = 0, curr = 1, count = 0;

		for (int i = 1; i < s.length(); i++) {
			if (s.charAt(i) == s.charAt(i - 1)) {
				curr++;
			} else {
				count += Math.min(prev, curr);// 0 和 1 必须是相同的个数
				prev = curr;
				curr = 1;
			}
		}
		count += Math.min(prev, curr);
		return count;
	}
}