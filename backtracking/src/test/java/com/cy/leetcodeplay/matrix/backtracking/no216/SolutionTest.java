package com.cy.leetcodeplay.matrix.backtracking.no216;

import com.alibaba.fastjson2.JSONArray;
import com.cy.leetcodeplay.backtracking.no216.Solution;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class SolutionTest {

	private Solution solution = new Solution();

	@Test
	public void test1() {
		int k = 3, n = 7;
		List<List<Integer>> res1 = solution.combinationSum3(k, n);
		Assertions.assertEquals("[[1,2,4]]", JSONArray.toJSONString(res1));
	}

	@Test
	public void test2() {
		int k = 3, n = 9;
		List<List<Integer>> res1 = solution.combinationSum3(k, n);
		Assertions.assertEquals("[[1,2,6],[1,3,5],[2,3,4]]", JSONArray.toJSONString(res1));
	}

	@Test
	public void test3() {
		int k = 4, n = 1;
		List<List<Integer>> res1 = solution.combinationSum3(k, n);
		Assertions.assertEquals("[]", JSONArray.toJSONString(res1));
	}
}