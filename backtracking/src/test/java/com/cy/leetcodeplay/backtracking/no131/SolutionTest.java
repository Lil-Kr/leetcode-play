package com.cy.leetcodeplay.backtracking.no131;

import com.alibaba.fastjson2.JSONArray;
import com.cy.leetcodeplay.backtracking.no131.Solution;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.List;

class SolutionTest {

	private Solution solution = new Solution();

	@Test
	public void test1() {
		String s = "aab";
		List<List<String>> res1 = solution.partition(s);
		System.out.println(JSONArray.toJSONString(res1));
		Assertions.assertEquals("[[\"a\",\"a\",\"b\"],[\"aa\",\"b\"]]", JSONArray.toJSONString(res1));
	}

	@Test
	public void test2() {
		String s = "a";
		List<List<String>> res1 = solution.partition(s);
		Assertions.assertEquals("[[\"a\"]]", JSONArray.toJSONString(res1));
	}
}