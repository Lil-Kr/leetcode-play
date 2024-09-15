package com.cy.leetcodeplay.array.no809;

/**
 * @Author: Lil-K
 * @Date: 2024/9/2
 * @Description: no.809. Expressive Words
 */
public class Solution {

	/**
	 *
	 * @param s
	 * @param words
	 * @return
	 */
	public int expressiveWords(String s, String[] words) {
		int count = 0;
		for (String word : words) {
			if (isStretchy(s, word)) {
				count++;
			}
		}
		return count;
	}

	private boolean isStretchy(String s, String word) {
		int i = 0, j = 0;
		while (i < s.length() && j < word.length()) {
			if (s.charAt(i) == word.charAt(j)) {
				int len1 = getRepeatedLength(s, i);
				int len2 = getRepeatedLength(word, j);
				/**
				 * 1. len1 < 3
				 * 2. len1 != len2
				 * 这两个条件 根据题目要求得到,
				 * 在目标字符串 s 中, 如果某个字符连续出现 3 次或更多次, 那么在 word 中相应的字符可以少于 3 次, 甚至可以只有 1 次或 2 次.
				 */
				if ((len1 < 3 && len1 != len2) || len1 < len2) {
					return false;
				}

				// 更新指针位置
				i += len1;
				j += len2;
			} else {
				return false;
			}
		}

		/**
		 * 各自的指针都到了最后一个位置, 说明过程中没有偏差
		 */
		return i == s.length() && j == word.length();
	}

	/**
	 * 计算字符串相同字符的个数
	 * @param s
	 * @param index
	 * @return
	 */
	private int getRepeatedLength(String s, int index) {
		int start = index;
		while (index < s.length() && s.charAt(index) == s.charAt(start)) {
			index++;
		}
		return index - start;
	}
}
