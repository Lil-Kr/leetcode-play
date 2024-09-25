package com.cy.leetcodeplay.array.no392;

/**
 * @Author: Lil-K
 * @Date: 2024/9/25
 * @Description: no.392. Is Subsequence
 *
 * 双指针
 */
public class Solution {

	/**
	 *
	 * @param s
	 * @param t
	 * @return
	 */
	public boolean isSubsequence(String s, String t) {
		if (s.length() == 0) return true;

		int ps = 0, pt = 0;
		int lens = s.length(), lent = t.length();

		while (pt < lent) {
			if (ps < s.length() && s.charAt(ps) == t.charAt(pt)) {
				ps++;
			}
			pt++;
		}
		return ps == lens;
	}
}
