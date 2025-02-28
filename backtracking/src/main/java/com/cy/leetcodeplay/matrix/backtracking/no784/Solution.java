package com.cy.leetcodeplay.matrix.backtracking.no784;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: Lil-K
 * @Date: 2024/10/25
 * @Description: no.784. Letter Case Permutation
 * 
 * 初始调用: 将字符串转换为字符数组并传入回溯函数.
 * 回溯逻辑: 
 *    如果当前字符是字母, 分为两种情况递归调用: 小写和大写.
 *    如果是数字, 直接跳到下一个字符.
 * 递归终止: 当遍历完成后, 将当前的字符数组转换为字符串并加入结果列表.
 */
public class Solution {

	private List<String> res = new ArrayList<>();

	/**
	 * 回溯
	 * @param s
	 * @return
	 */
	public List<String> letterCasePermutation(String s) {
		backtrack(s.toCharArray(), 0);
		return res;
	}

	private void backtrack(char[] chars, int index) {
		if (chars.length == index) {
			res.add(new String(chars));
			return;
		}

		/**
		 * 如果是字母, 大小写都
		 */
		if (Character.isLetter(chars[index])) {

			chars[index] = Character.toLowerCase(chars[index]);
			backtrack(chars, index + 1);

			chars[index] = Character.toUpperCase(chars[index]);
			backtrack(chars, index + 1);
			} else { // 数字直接跳过
				backtrack(chars, index + 1);
		}
	}
}