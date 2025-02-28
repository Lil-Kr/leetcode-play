package com.cy.leetcodeplay.matrix.backtracking.no40;
import com.alibaba.fastjson2.JSONArray;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class SolutionTest {

	private Solution solution = new Solution();

	@Test
	public void test1() {
		int[] candidates = {10, 1, 2, 7, 6, 1, 5};
		int target = 8;
		List<List<Integer>> res1 = solution.combinationSum2(candidates, target);
		Assertions.assertEquals("[[1,1,6],[1,2,5],[1,7],[2,6]]", JSONArray.toJSONString(res1));
	}

	@Test
	public void test2() {
		int[] candidates = {2, 5, 2, 1, 2};
		int target = 5;
		List<List<Integer>> res1 = solution.combinationSum2(candidates, target);
		Assertions.assertEquals("[[1,2,2],[5]]", JSONArray.toJSONString(res1));
	}
}