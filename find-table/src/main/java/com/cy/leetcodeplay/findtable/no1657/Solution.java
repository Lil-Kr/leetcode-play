package com.cy.leetcodeplay.findtable.no1657;

import java.util.Arrays;

/**
 * @Author: Lil-K
 * @Date: 2025/8/26
 * @Description: no.1657. Determine if Two Strings Are Close
 * link: https://leetcode.com/problems/determine-if-two-strings-are-close/description
 * todo: 未录入Anki
 */
public class Solution {

	public boolean closeStrings(String word1, String word2) {
		if (word1.length() != word2.length()) return false;

		int[] freq1 = new int[26];
		int[] freq2 = new int[26];

		for (char c : word1.toCharArray()) {
			freq1[c - 'a'] ++;
		}
		for (char c : word2.toCharArray()) {
			freq2[c - 'a'] ++;
		}

		// check letters are same or not
		for (int i = 0; i < 26; i++) {
			if ((freq1[i] == 0 && freq2[i] != 0) || (freq1[i] != 0 && freq2[i] == 0)) {
				return false;
			}
		}

		Arrays.sort(freq1);
		Arrays.sort(freq2);
		return Arrays.equals(freq1, freq2);
	}
}