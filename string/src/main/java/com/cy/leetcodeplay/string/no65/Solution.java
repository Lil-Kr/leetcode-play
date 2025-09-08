package com.cy.leetcodeplay.string.no65;

/**
 * @Author: Lil-K
 * @Date: 2024/11/2
 * @Description: no.65. Valid Number
 * todo: 待完成
 * todo: 未录入Anki
 */
public class Solution {

	/**
	 * 解法一:
	 * @param s
	 * @return
	 */
	public boolean isNumber(String s) {
		// 去除前后空格
		s = s.trim();

		// 是否遇到小数点、数字、e
		boolean seenDigit = false, seenDot = false, seenExp = false;

		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);

			// 处理数字
			if (Character.isDigit(c)) {
				seenDigit = true;

				// 处理小数点
			} else if (c == '.') {
				// 如果之前已经遇到小数点或 'e'，则不合法
				if (seenDot || seenExp) return false;
				seenDot = true;

				// 处理科学计数法的 'e' 或 'E'
			} else if (c == 'e' || c == 'E') {
				// 'e' 前面必须有数字，且只能出现一次
				if (seenExp || !seenDigit) return false;
				seenExp = true;
				seenDigit = false; // 'e' 后面必须有数字

				// 处理正负号
			} else if (c == '+' || c == '-') {
				// 正负号必须在开头，或者在 'e' 之后
				if (i > 0 && s.charAt(i - 1) != 'e' && s.charAt(i - 1) != 'E') return false;

				// 遇到其它字符直接返回 false
			} else {
				return false;
			}
		}

		return seenDigit;
	}

	/**
	 * 解法二: 正则表达式
	 * @param s
	 * @return
	 */
	public boolean isNumber2(String s) {
		String pattern = "^[+-]?((\\d+\\.?\\d*)|(\\.\\d+))([eE][+-]?\\d+)?$";
		return s.trim().matches(pattern);
	}
}