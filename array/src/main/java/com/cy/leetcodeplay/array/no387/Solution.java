package com.cy.leetcodeplay.array.no387;

/**
 * @Author: Lil-K
 * @Date: 2024/9/1
 * @Description: no.387. First Unique Character in a String
 */
public class Solution {

	public int firstUniqChar(String s) {
		int[] freqS = new int[26];
		for (int i = 0; i < s.length(); i++) {
			freqS[s.charAt(i) - 'a'] ++;
		}

		for (int i = 0; i < s.length(); i++) {
			if (freqS[s.charAt(i) - 'a'] == 1) {
				return i;
			}
		}
		return -1;
	}
}
