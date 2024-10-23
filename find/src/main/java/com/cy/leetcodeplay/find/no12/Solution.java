package com.cy.leetcodeplay.find.no12;

/**
 * @Author: Lil-K
 * @Date: 2024/10/23
 * @Description: no.12. Integer to Roman
 * todo: 未录入题库
 */
public class Solution {

	/**
	 *
	 * @param num
	 * @return
	 */
	public String intToRoman(int num) {
		/**
		 * 罗马数字的符号和对应的值
		 */
		int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
		String[] symbols = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
		StringBuilder roman = new StringBuilder();

		/**
		 * 遍历罗马数字符号, 从大到小
		 */
		for (int i = 0; i < values.length; i++) {
			/**
			 * 将符号对应的值从 num 中减去, 直到不满足条件
			 */
			while (num >= values[i]) {
				num -= values[i];
				roman.append(symbols[i]);
			}
		}

		return roman.toString();
	}
}
