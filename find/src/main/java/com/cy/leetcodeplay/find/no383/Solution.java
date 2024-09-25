package com.cy.leetcodeplay.find.no383;

/**
 * @Author: Lil-K
 * @Date: 2024/9/25
 * @Description: no.383. Ransom Note
 * 用hash表
 */
public class Solution {

	/**
	 *
	 * @param ransomNote
	 * @param magazine
	 * @return
	 */
	public boolean canConstruct(String ransomNote, String magazine) {
		if (ransomNote.length() > magazine.length()) return false;

		int[] freq = new int[26];
		for (int i = 0; i < magazine.length(); i++) {
			freq[magazine.charAt(i) - 'a']++;
		}

		for (char ch : ransomNote.toCharArray()) {
			freq[ch - 'a']--;
			if (freq[ch - 'a'] < 0) {
				return false;
			}
		}
		return true;
	}
}