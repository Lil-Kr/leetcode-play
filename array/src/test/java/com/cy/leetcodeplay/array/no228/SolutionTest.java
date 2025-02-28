package com.cy.leetcodeplay.array.no228;

import com.alibaba.fastjson2.JSONArray;
import com.cy.leetcodeplay.array.no228.Solution;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class SolutionTest {

	private Solution solution = new Solution();

	@Test
	public void test1() {
		int[] nums = {0, 1, 2, 4, 5, 7};

		List<String> res1 = solution.summaryRanges(nums);
		System.out.println(JSONArray.toJSONString(res1));
		Assertions.assertEquals("[\"0->2\",\"4->5\",\"7\"]", JSONArray.toJSONString(res1));
	}

	@Test
	public void test2() {
		int[] nums = {0, 2, 3, 4, 6, 8, 9};

		List<String> res1 = solution.summaryRanges(nums);
		System.out.println(JSONArray.toJSONString(res1));
		Assertions.assertEquals("[\"0\",\"2->4\",\"6\",\"8->9\"]", JSONArray.toJSONString(res1));
	}

	@Test
	public void test3() {
		int[] nums = {0};

		List<String> res1 = solution.summaryRanges(nums);
		System.out.println(JSONArray.toJSONString(res1));
		Assertions.assertEquals("[\"0\"]", JSONArray.toJSONString(res1));
	}
}