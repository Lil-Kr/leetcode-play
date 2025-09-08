package com.cy.leetcodeplay.string.no1768;

/**
 * @Author: Lil-K
 * @Date: 2025/8/24
 * @Description: no.1768. Merge Strings Alternately
 * link: https://leetcode.com/problems/merge-strings-alternately/description/
 *
 * todo: 未录入Anki
 */
public class Solution {

	/**
	 *
	 * @param word1
	 * @param word2
	 * @return
	 */
	public String mergeAlternately(String word1, String word2) {
		int n = word1.length(), m = word2.length();

		int i = 0, j = 0;

		StringBuilder res = new StringBuilder();

		while (i < n && j < m) {
			res.append(word1.charAt(i));
			res.append(word2.charAt(j));
			i++;
			j++;
		}

		while (i < n) {
			res.append(word1.charAt(i));
			i++;
		}

		while (j < m) {
			res.append(word2.charAt(j));
			j++;
		}

		return res.toString();
	}
}
