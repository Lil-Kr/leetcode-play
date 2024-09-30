package com.cy.leetcodeplay.array.no30;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author: Lil-K
 * @Date: 2024/9/30
 * @Description: no.30. Substring with Concatenation of All Words
 *
 * hash table + sliding windows
 */
public class Solution {

	/**
	 *
	 * @param s
	 * @param words
	 * @return
	 */
	public List<Integer> findSubstring(String s, String[] words) {
		List<Integer> res = new ArrayList<>();
		if (s == null || s.length() < 1 || words.length < 1) return res;

		// 获取每个word的长度
		int wordLength = words[0].length();
		// 获取总长度
		int totalWordsLength = wordLength * words.length;
		Map<String, Integer> wordCount = new HashMap<>();


		return res;
	}
}