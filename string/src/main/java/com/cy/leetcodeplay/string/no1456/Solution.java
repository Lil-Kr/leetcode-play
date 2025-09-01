package com.cy.leetcodeplay.string.no1456;

import java.util.HashSet;
import java.util.Set;

/**
 * @Author: Lil-K
 * @Date: 2025/9/1
 * @Description: no.1456. Maximum Number of Vowels in a Substring of Given Length
 * link: https://leetcode.com/problems/maximum-number-of-vowels-in-a-substring-of-given-length/description/
 *
 * todo: 未录入题库
 * Sliding Window
 */
public class Solution {

	/**
	 * solution 1: use Set
	 * @param s
	 * @param k
	 * @return
	 */
	public int maxVowels1(String s, int k) {
		Set<Character> vowels = new HashSet<>();
		vowels.add('a');
		vowels.add('e');
		vowels.add('i');
		vowels.add('o');
		vowels.add('u');

		int n = s.length();
		int count = 0, maxCount = 0;
		for (int i = 0; i < k; i ++) {
			if (vowels.contains(s.charAt(i))) count++;
		}

		maxCount = count;

		for (int i = k; i < n; i ++) {
			if (vowels.contains(s.charAt(i))) {
				count ++;
			}

			if (vowels.contains(s.charAt(i - k))) {
				count--;
			}

			maxCount = Math.max(maxCount, count);
			if (maxCount == k) return k;
		}

		return maxCount;
	}

	/**
	 * solution 2: use array hash table
	 * achieves better performance runtime
	 * @param s
	 * @param k
	 * @return
	 */
	public int maxVowels(String s, int k) {
		int[] vowels = new int[26];
		vowels['a' - 'a']++;
		vowels['e' - 'a']++;
		vowels['i' - 'a']++;
		vowels['o' - 'a']++;
		vowels['u' - 'a']++;

		int n = s.length();
		int count = 0, maxCount = 0;
		for (int i = 0; i < k; i ++) {
			if (vowels[s.charAt(i) - 'a'] != 0) count++;
		}

		maxCount = count;

		for (int i = k; i < n; i ++) {
			if (vowels[s.charAt(i) - 'a'] != 0) {
				count ++;
			}

			if (vowels[s.charAt(i - k) - 'a'] != 0) {
				count--;
			}

			maxCount = Math.max(maxCount, count);
			if (maxCount == k) return k;
		}

		return maxCount;
	}
}