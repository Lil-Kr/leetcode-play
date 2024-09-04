package com.cy.leetcodeplay.array.no859;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Author: Lil-K
 * @Date: 2024/9/2
 * @Description:
 */
public class Solution {

	public static void main(String[] args) {
		int[][] intervals = new int[4][4];
		Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
	}

	public boolean buddyStrings(String s, String goal) {
		if (s.length() != goal.length()) {
			return false;
		}


		if(s.equals(goal)){ // "abc" and "abc" --> false,  aac and aac  --> true
			int[] freqS = new int[26];
			for (char c : s.toCharArray()) {
				freqS[c - 'a']++;
				if (freqS[c - 'a'] > 1) {
					return true;
				}
			}
			return false;
		} else { // "abfffc" and "acfffb" --> true,  "abc" and "eaf"
			List<Integer> res = new ArrayList<>();
			for (int i = 0; i < s.length(); i++) {
				if (s.charAt(i) != goal.charAt(i)) {
					res.add(i);
				}
			}
			return res.size() == 2 && s.charAt(res.get(0)) == goal.charAt(res.get(1)) && s.charAt(res.get(1)) == goal.charAt(res.get(0));
		}
	}
}
