package com.cy.leetcodeplay.string.no30;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author: Lil-K
 * @Date: 2025/4/10
 * @Description: no.30. Substring with Concatenation of All Words
 * link: https://leetcode.com/problems/substring-with-concatenation-of-all-words/description/
 *
 * 滑动窗口 + 哈希表
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
		if (s == null || s.length() == 0 || words == null || words.length == 0) {
			return res;
		}

		int wordLen = words[0].length();
		int totalWords = words.length;
		int totalLen = wordLen * totalWords;
		if (s.length() < totalLen) {
			return res;
		}

		/**
		 * 记录 words 中, 每个 word 的频率, 不需要强调顺序
		 */
		Map<String, Integer> wordCount = new HashMap<>();
		for (String word : words) {
			wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
		}

		/**
		 * 这里是重点
		 * 按 wordLen 分组, 查重
		 */
		for (int i = 0; i < wordLen; i++) {
			/**
			 * 初始化数据, 滑动窗口的左右边界
			 */
			int left = i;
			int right = i;
			int count = 0;

			Map<String, Integer> currentCount = new HashMap<>();

			/**
			 * 这里使用 <= 是因为 wordLen是长度, 不是索引值
			 */
			while (right + wordLen <= s.length()) {
				String word = s.substring(right, right + wordLen);
				right += wordLen;

				if (wordCount.containsKey(word)) {
					// 记录 s 中出现这个字符的映射关系
					currentCount.put(word, currentCount.getOrDefault(word, 0) + 1);
					count++;

					/**
					 * 当前word的数量超过了 words 中对应word的数量时, 说明左边界需要往右边收缩
					 */
					while (currentCount.get(word) > wordCount.get(word)) {
						String leftWord = s.substring(left, left + wordLen);
						currentCount.put(leftWord, currentCount.get(leftWord) - 1);
						left += wordLen;
						count--;
					}

					if (count == totalWords) {
						res.add(left);
					}
				} else {
					currentCount.clear();
					count = 0;
					left = right;
				}
			}
		}

		return res;
	}
}
