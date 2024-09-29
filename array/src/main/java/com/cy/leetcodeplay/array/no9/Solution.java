package com.cy.leetcodeplay.array.no9;

/**
 * @Author: Lil-K
 * @Date: 2024/9/29
 * @Description: no.9. Palindrome Number
 */
public class Solution {

	/**
	 *
	 * @param x
	 * @return
	 */
	public boolean isPalindrome(int x) {
		if (String.valueOf(x).length() < 1) return false;
		if (x < 0) return false;

		String str = String.valueOf(x);
		int l = 0, r = str.length() - 1;

		while (l < r) {
			if (str.charAt(l) != str.charAt(r)) {
				return false;
			}
			l++;
			r--;
		}
		return true;
	}
}