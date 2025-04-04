package com.cy.leetcodeplay.findtable.no242;

import java.util.Arrays;

/**
 * @Author: Lil-K
 * @Date: 2024/9/5
 * @Description: no.242. Valid Anagram
 */
public class Solution {

	/**
	 * 解法一:
	 * @param s
	 * @param t
	 * @return
	 */
	public boolean isAnagram(String s, String t) {
		if(s.length() != t.length()) return false;

		int[] freqS = new int[26];
		int[] freqT = new int[26];

		for (char c : s.toCharArray()) {
			freqS[c - 'a']++;
		}
		for (char c : t.toCharArray()) {
			freqT[c - 'a']++;
		}

		if (!Arrays.equals(freqS, freqT)) {
			return false;
		}

		return true;
	}

	/**
	 * 解法二
	 * @param s
	 * @param t
	 * @return
	 */
	public boolean isAnagram2(String s, String t) {
		if(s.length() != t.length()) return false;

		int[] count = new int[26];

		for (int i = 0; i < s.length(); i++) {
			count[s.charAt(i) - 'a']++;
			count[t.charAt(i) - 'a']--;
		}

		for (int i = 0; i < 26; i++) {
			if (count[i] != 0) {
				return false;
			}
		}

		return true;
	}
}
