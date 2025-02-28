package com.cy.leetcodeplay.matrix.findtable.no205;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: Lil-K
 * @Date: 2024/9/5
 * @Description:
 */
public class Solution {

	/**
	 *
	 * @param s
	 * @param t
	 * @return
	 */
	public boolean isIsomorphic(String s, String t) {
		if (s.length() != t.length()) {
			return false;
		}

		// s -> t
		Map<String, String> s2t = new HashMap<>();
		// t -> s
		Map<String, String> t2s = new HashMap<>();

		for (int i = 0; i < s.length(); i++) {
			String ss = Character.toString(s.charAt(i));
			String tt = Character.toString(t.charAt(i));

			if (s2t.containsKey(ss)) {
				if (!s2t.get(ss).equals(tt)) {
					return false;
				}
			} else {
				s2t.put(ss, tt);
			}

			if (t2s.containsKey(tt)) {
				if (!t2s.get(tt).equals(ss)) {
					return false;
				}
			} else {
				t2s.put(tt, ss);
			}
		}
		return true;
	}
}
