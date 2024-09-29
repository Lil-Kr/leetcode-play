package com.cy.leetcodeplay.array.no58;

/**
 * @Author: Lil-K
 * @Date: 2024/9/29
 * @Description: no.58. Length of Last Word
 */
public class Solution {

	/**
	 * 从末尾开始遍历
	 * @param s
	 * @return
	 */
	public int lengthOfLastWord(String s) {
		if (s.length() < 1) return 0;

		int count = 0;
		int r = s.length() - 1;

		while (r >= 0 && s.charAt(r) == ' ') {
			r--;
		}

		while (r >= 0 && s.charAt(r) != ' ') {
			count++;
			r--;
		}

		return count;
	}
}