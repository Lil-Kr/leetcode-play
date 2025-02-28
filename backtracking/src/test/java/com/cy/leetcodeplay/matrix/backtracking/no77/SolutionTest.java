package com.cy.leetcodeplay.matrix.backtracking.no77;

import com.alibaba.fastjson2.JSONArray;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.List;

class SolutionTest {

	private Solution solution = new Solution();

	@Test
	public void test1() {
		int n = 4, k = 2;
		List<List<Integer>> res1 = solution.combine(n, k);
		Assertions.assertEquals("[[1,2],[1,3],[1,4],[2,3],[2,4],[3,4]]", JSONArray.toJSONString(res1));
	}

	@Test
	public void test2() {
		int n = 1, k = 1;
		List<List<Integer>> res1 = solution.combine(n, k);
		Assertions.assertEquals("[[1]]", JSONArray.toJSONString(res1));
	}
}