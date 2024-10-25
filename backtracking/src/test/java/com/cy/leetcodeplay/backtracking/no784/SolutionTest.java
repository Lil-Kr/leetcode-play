package com.cy.leetcodeplay.backtracking.no784;

import com.alibaba.fastjson2.JSONArray;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class SolutionTest {

	private Solution solution = new Solution();

	@Test
	public void test1() {
		String s = "a1b2";
		List<String> res1 = solution.letterCasePermutation(s);
		Assertions.assertEquals("[\"a1b2\",\"a1B2\",\"A1b2\",\"A1B2\"]", JSONArray.toJSONString(res1));
	}

	@Test
	public void test2() {
		String s = "3z4";
		List<String> res1 = solution.letterCasePermutation(s);
		Assertions.assertEquals("[\"3z4\",\"3Z4\"]", JSONArray.toJSONString(res1));
	}
}