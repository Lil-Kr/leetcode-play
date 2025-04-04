package com.cy.leetcodeplay.matrix.backtracking.no39;

import com.alibaba.fastjson2.JSONArray;
import com.cy.leetcodeplay.backtracking.no39.Solution;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.List;

class SolutionTest {

	private Solution solution = new Solution();

	@Test
	public void test1() {
		int[] candidates = {2, 3, 6, 7};
		int target = 7;
		List<List<Integer>> res1 = solution.combinationSum(candidates, target);
		Assertions.assertEquals("[[2,2,3],[7]]", JSONArray.toJSONString(res1));
	}

	@Test
	public void test2() {
		int[] candidates = {2, 3, 5};
		int target = 8;
		List<List<Integer>> res1 = solution.combinationSum(candidates, target);
		Assertions.assertEquals("[[2,2,2,2],[2,3,3],[3,5]]", JSONArray.toJSONString(res1));
	}
}