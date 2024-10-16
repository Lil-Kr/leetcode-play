package com.cy.leetcodeplay.array.no434;

/**
 * @Author: Lil-K
 * @Date: 2024/9/1
 * @Description: no.434. Number of Segments in a String
 * 解法一: 使用 java自带的api: split()
 * 解法二: 遍历一遍数组, 做逻辑处理
 */
public class Solution {

	public int countSegments(String s) {

		int count = 0;

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) != ' ' && (i == 0 || s.charAt(i - 1) == ' ')) {
				count++;
			}
		}
		return count;
	}
}
