package com.cy.leetcodeplay.backtracking.no22;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: Lil-K
 * @Date: 2024/10/29
 * @Description: no.22. Generate Parentheses
 * link: https://leetcode.com/problems/generate-parentheses/description/
 */
public class Solution {

	/**
	 * 回溯: 通过递归构建字符串 cur.
	 * 终止条件: 当生成的字符串 cur 长度为 2 * n 时, 将它加入结果集.
	 * 约束条件:
		 * 若当前已添加的左括号数小于 n, 则可以添加左括号;
		 * 若当前已添加的右括号数小于已添加的左括号数, 则可以添加右括号.
	 * @param n
	 * @return
	 */
	public List<String> generateParenthesis(int n) {
		List<String> res = new ArrayList<>();
		backtrack("", 0, 0, n, res);
		return res;
	}

	/**
	 *
	 * @param cur
	 * @param open
	 * @param close
	 * @param n
	 * @param res
	 */
	private void backtrack(String cur, int open, int close, int n, List<String> res) {
		if (cur.length() == n * 2) {
			res.add(cur);
			return;
		}

		/**
		 * 继续添加左括号
		 */
		if (open < n) {
			backtrack(cur + "(", open + 1, close, n, res);
		}

		/**
		 * 继续添加右括号
		 */
		if (close < open) {
			backtrack(cur + ")", open, close + 1, n, res);
		}
	}

	/**
	 * ================ 写法二 ================
	 */
	private List<String> res = new ArrayList<>();

	public List<String> generateParenthesis2(int n) {
		backtraking2(n, 0, 0, new StringBuilder());
		return res;
	}

	private void backtraking2(int n, int open, int close, StringBuilder s) {
		if (s.length() == n * 2) {
			res.add(s.toString());
			return;
		}

		if (open < n) {
			s.append("(");
			backtraking2(n, open + 1, close, s);
			s.deleteCharAt(s.length() - 1);
		}

		if (close < open) {
			s.append(")");
			backtraking2(n, open, close + 1, s);
			s.deleteCharAt(s.length() - 1);
		}
	}
}