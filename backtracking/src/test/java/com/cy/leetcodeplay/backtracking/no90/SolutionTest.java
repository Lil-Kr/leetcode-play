package com.cy.leetcodeplay.backtracking.no90;

import com.alibaba.fastjson2.JSONArray;
import com.cy.leetcodeplay.backtracking.no90.Solution;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.List;

class SolutionTest {

	private Solution solution = new Solution();

	@Test
	public void test1() {
		int[] nums = {1, 2, 2};
		List<List<Integer>> res1 = solution.subsetsWithDup(nums);
		Assertions.assertEquals("[[],[1],[1,2],[1,2,2],[2],[2,2]]", JSONArray.toJSONString(res1));
	}

	@Test
	public void test2() {
		int[] nums = {0};
		List<List<Integer>> res1 = solution.subsetsWithDup(nums);
		Assertions.assertEquals("[[],[0]]", JSONArray.toJSONString(res1));
	}
}