package com.cy.leetcodeplay.findtable.no290;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: Lil-K
 * @Date: 2024/9/5
 * @Description: no.290. Word Pattern
 */
public class Solution {

	/**
	 *
	 * @param pattern
	 * @param s
	 * @return
	 */
	public boolean wordPattern(String pattern, String s) {
		String[] words = s.split(" ");
		if (words.length != pattern.length()) {
			return false;
		}

		// char -> word
		Map<String, String> map1 = new HashMap<>();

		// word -> char
		Map<String, String> map2 = new HashMap<>();
		for(int i = 0; i < pattern.length(); i++) {
			String ch = Character.toString(pattern.charAt(i));
			String word = words[i];

			if (map1.containsKey(ch)) {
				if (!map1.get(ch).equals(word)) {
					return false;
				}
			} else {
				map1.put(ch, word);
			}

			if (map2.containsKey(word)) {
				if (!map2.get(word).equals(ch)) {
					return false;
				}
			} else {
				map2.put(word, ch);
			}
		}
		return true;
	}
}
