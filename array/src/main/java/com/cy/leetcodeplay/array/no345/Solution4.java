package com.cy.leetcodeplay.array.no345;

/**
 * @Author: Lil-K
 * @Date: 2024/8/25
 * @Description:
 * 解法四: 对撞指针
 */
public class Solution4 {

	public String reverseVowels(String s) {
		if (s.length() <= 1) return s;

		String vowels = "aeiouAEIOU";
		boolean[] freqVowels = new boolean[256];
		for (int i = 0; i < vowels.length(); i++) {
			freqVowels[vowels.charAt(i)] = true;
		}


		char[] charArray = s.toCharArray();

		int l = 0, r = s.length() - 1;
		while (l < r) {
			while (l < r && !check(s.charAt(l), freqVowels)) {
				l++;
			}
			while (l < r && !check(s.charAt(r), freqVowels)) {
				r--;
			}

			char temp = charArray[l];
			charArray[l] = charArray[r];
			charArray[r] = temp;
			l++;
			r--;
		}
		return String.valueOf(charArray);
	}

	private static boolean check(char s, boolean[] freqVowels) {
		return freqVowels[s] ? true : false;
	}
}
