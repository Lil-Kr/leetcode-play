package com.cy.leetcodeplay.matrix.backtracking.no17;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: Lil-K
 * @Date: 2024/10/24
 * @Description: no.17. Letter Combinations of a Phone Number
 */
public class Solution {

	/**
	 * 数字对应的字母映射
	 */
	private static final String[] KEYPAD = {
		" ",    // 0
		"",    // 1
		"abc", // 2
		"def", // 3
		"ghi", // 4
		"jkl", // 5
		"mno", // 6
		"pqrs", // 7
		"tuv", // 8
		"wxyz"  // 9
	};

	private List<String> result = new ArrayList<>();

	/**
	 *
	 * @param digits
	 * @return
	 */
	public List<String> letterCombinations(String digits) {
		if (digits == null || digits.length() == 0) {
			return result;
		}

		backtrack(new StringBuilder(), digits, 0);
		return result;
	}

	/**
	 *
	 * @param combination
	 * @param digits
	 * @param index
	 */
	private void backtrack(StringBuilder combination, String digits, int index) {
		// 当遍历完所有数字时, 将组合添加到结果列表中
		if (index == digits.length()) {
			result.add(combination.toString());
			return;
		}

		/**
		 * 获取当前数字
		 */
		char digit = digits.charAt(index);

		/**
		 * 得到数字对应的字母
		 */
		String letters = KEYPAD[digit - '0'];

		/**
		 * 遍历所有可能的字母并进行递归
		 */
		for (char letter : letters.toCharArray()) {
			/**
			 * 将当前字母添加到组合中
			 */
			combination.append(letter);

			/**
			 * 递归处理下一个数字
			 */
			backtrack(combination, digits, index + 1);

			/**
			 * 回溯, 删除最后一个字母
			 */
			combination.deleteCharAt(combination.length() - 1);
		}
	}

}