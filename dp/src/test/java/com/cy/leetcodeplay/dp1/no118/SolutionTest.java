package com.cy.leetcodeplay.dp1.no118;

import com.alibaba.fastjson2.JSONArray;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class SolutionTest {
	private Solution solution = new Solution();

	@Test
	public void test1() {
		int numRows = 5;
		List<List<Integer>> res = solution.generate(numRows);
		Assertions.assertEquals("[[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]]", JSONArray.toJSONString(res));
	}

	@Test
	public void test2() {
		int numRows = 1;
		List<List<Integer>> res = solution.generate(numRows);
		Assertions.assertEquals("[[1]]", JSONArray.toJSONString(res));
	}

	@Test
	public void test3() {
		int numRows = 3;
		List<List<Integer>> res = solution.generate(numRows);
		Assertions.assertEquals("[[1],[1,1],[1,2,1]]", JSONArray.toJSONString(res));
	}

	@Test
	public void test4() {
		int numRows = 5;
		List<List<Integer>> res = solution.generate2(numRows);
		Assertions.assertEquals("[[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]]", JSONArray.toJSONString(res));
	}

	@Test
	public void test5() {
		int numRows = 1;
		List<List<Integer>> res = solution.generate2(numRows);
		Assertions.assertEquals("[[1]]", JSONArray.toJSONString(res));
	}

	@Test
	public void test6() {
		int numRows = 3;
		List<List<Integer>> res = solution.generate2(numRows);
		Assertions.assertEquals("[[1],[1,1],[1,2,1]]", JSONArray.toJSONString(res));
	}
}