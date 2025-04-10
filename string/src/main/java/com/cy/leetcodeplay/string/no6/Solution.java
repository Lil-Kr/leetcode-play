package com.cy.leetcodeplay.string.no6;

/**
 * @Author: Lil-K
 * @Date: 2025/4/10
 * @Description: no.6. Zigzag Conversion
 * link: https://leetcode.com/problems/zigzag-conversion/description
 * todo: 未录入题库
 *
 * Z 字形排列规律:
 *  字符先向下填充到第 numRows 行, 然后斜向上填充到第 1 行, 如此反复.
 *
 * 每一行的字符索引可以通过数学规律计算:
 *  向下移动时, 行号 +1
 *  斜向上移动时, 行号 -1
 *
 * 关键观察:
 * 每一行的字符在字符串 s 中的位置可以通过周期计算:
 * 完整周期的长度 cycleLen = 2 * numRows - 2(如果 numRows > 1).
 *
 * 在周期内:
 *  第 i 行的字符索引为 j + i 和 j + cycleLen - i(斜向上部分)。
 *  注意边界情况(如 numRows = 1 时直接返回原字符串)。
 */
public class Solution {

	public String convert(String s, int numRows) {
		if (numRows == 1) {
			return s;
		}

		StringBuilder res = new StringBuilder();
		int n = s.length();
		int cycleLen = 2 * numRows - 2;

		for (int i = 0; i < numRows; i++) {
			for (int j = 0; j + i < n; j += cycleLen) {
				/**
				 * 向下部分的字符索引为 j + i (j 是周期的起始索引)
				 */
				res.append(s.charAt(j + i));
				if (i != 0 && i != numRows - 1 && j + cycleLen - i < n) {
					/**
					 * 斜向上部分的字符索引为 j + cycleLen - i (需确保 i 不是首行或末行, 且索引不越界)
					 */
					res.append(s.charAt(j + cycleLen - i));
				}
			}
		}

		return res.toString();
	}
}