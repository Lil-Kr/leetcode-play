package com.cy.leetcodeplay.backtracking.no78;

import com.alibaba.fastjson2.JSONArray;
import org.junit.jupiter.api.Test;

import java.util.List;

class SolutionTest {

	private Solution solution = new Solution();

	@Test
	public void test1() {
		int[] nums = {1, 2, 3};
		List<List<Integer>> res1 = solution.subsets(nums);
		String json = JSONArray.toJSONString(res1);
		System.out.println(json);
	}

	@Test
	public void test2() {
		int[] nums = {0};
		List<List<Integer>> res1 = solution.subsets(nums);
		String json = JSONArray.toJSONString(res1);
		System.out.println(json);
	}
}