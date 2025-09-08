package com.cy.leetcodeplay.string.no1071;

/**
 * @Author: Lil-K
 * @Date: 2025/8/24
 * @Description: no.1071. Greatest Common Divisor of Strings
 * link: https://leetcode.com/problems/greatest-common-divisor-of-strings/description/
 *
 * todo: 未录入Anki
 */
public class Solution {

	/**
	 *
	 * @param str1
	 * @param str2
	 * @return
	 */
	public String gcdOfStrings(String str1, String str2) {
		if (!(str1 + str2).equals(str2 + str1)) {
			return "";
		}

		int gcdLen = gcd(str1.length(), str2.length());
		return str1.substring(0, gcdLen);
	}

	private int gcd(int a, int b) {
		return b == 0 ? a : gcd(b, a % b);
	}
}