package com.cy.leetcodeplay.matrix.string.no151;

/**
 * @Author: Lil-K
 * @Date: 2024/10/23
 * @Description: no.151. Reverse Words in a String
 */
public class Solution {

	/**
	 *
	 * @param s
	 * @return
	 */
	public String reverseWords(String s) {
		/**
		 * 去除首尾的空格并按一个或多个空格分割单词
		 * "\\s+" 是一个正则表达式, 将字符串按照一个或者多个分隔
		 */
		String[] words = s.trim().split("\\s+");

		// 使用 StringBuilder 来反转单词顺序并拼接
		StringBuilder res = new StringBuilder();

		// 反向遍历单词数组
		for (int i = words.length - 1; i >= 0; i--) {
			res.append(words[i]);
			if (i != 0) {  // 单词之间加空格, 最后一个单词后面不加空格
				res.append(" ");
			}
		}

		return res.toString();
	}
}
