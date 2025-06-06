package com.cy.leetcodeplay.backtracking.no47;
import com.alibaba.fastjson2.JSONArray;
import com.cy.leetcodeplay.backtracking.no47.Solution;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class SolutionTest {

	private Solution solution = new Solution();

	@Test
	public void test1() {
		int[] nums = {1,1,2};
		List<List<Integer>> res1 = solution.permuteUnique(nums);
		System.out.println(JSONArray.toJSONString(res1));
		Assertions.assertEquals("[[1,1,2],[1,2,1],[2,1,1]]", JSONArray.toJSONString(res1));
	}

	@Test
	public void test2() {
		int[] nums = {0,1};
		List<List<Integer>> res1 = solution.permuteUnique(nums);
		System.out.println(JSONArray.toJSONString(res1));
		Assertions.assertEquals("[[0,1],[1,0]]", JSONArray.toJSONString(res1));
	}

	@Test
	public void test3() {
		int[] nums = {1,2,3};
		List<List<Integer>> res1 = solution.permuteUnique(nums);
		System.out.println(JSONArray.toJSONString(res1));
		Assertions.assertEquals("[[1,2,3],[1,3,2],[2,1,3],[2,3,1],[3,1,2],[3,2,1]]", JSONArray.toJSONString(res1));
	}
}