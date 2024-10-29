package com.cy.leetcodeplay.backtracking.no22;

import com.alibaba.fastjson2.JSONArray;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class SolutionTest {

	private Solution solution = new Solution();

	@Test
	public void test1() {
		int n = 3;
		List<String> res1 = solution.generateParenthesis(n);
		System.out.println(JSONArray.toJSONString(res1));
		Assertions.assertEquals("[\"((()))\",\"(()())\",\"(())()\",\"()(())\",\"()()()\"]", JSONArray.toJSONString(res1));
	}
	@Test
	public void test2() {
		int n = 1;
		List<String> res1 = solution.generateParenthesis(n);
		System.out.println(JSONArray.toJSONString(res1));
		Assertions.assertEquals("[\"()\"]", JSONArray.toJSONString(res1));
	}
}