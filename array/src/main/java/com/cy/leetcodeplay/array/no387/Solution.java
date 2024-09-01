package com.cy.leetcodeplay.array.no387;

/**
 * @Author: Lil-K
 * @Date: 2024/9/1
 * @Description:
 */
public class Solution {

	public static void main(String[] args) {
		
	}

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
