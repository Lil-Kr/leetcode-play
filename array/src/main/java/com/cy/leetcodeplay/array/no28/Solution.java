package com.cy.leetcodeplay.array.no28;

/**
 * @Author: Lil-K
 * @Date: 2024/9/3
 * @Description:
 */
public class Solution {

	public int strStr(String haystack, String needle) {
		int h = haystack.length();
		int n = needle.length();

		if (n == 0) return -1;
		if (h < n) return -1;

		/**
		 * h - n 表示 查找的有效位置
		 * for循环中, 确保 n + i 不越界
		 */
		for (int i = 0; i <= h - n; i++) {
			if (haystack.substring(i, n + i).equals(needle)) {
				return i;
			}
		}
		return -1;
	}
}
