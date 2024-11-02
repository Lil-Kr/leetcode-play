package com.cy.leetcodeplay.findtable.no15;

import com.alibaba.fastjson2.JSONArray;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class SolutionTest {
	private Solution solution = new Solution();

	@Test
	public void test1() {
		int[] nums = {-1, 0, 1, 2, -1, -4};
		List<List<Integer>> res1 = solution.threeSum(nums);
		String jsonString = JSONArray.toJSONString(res1);
		System.out.println(jsonString);
		Assertions.assertEquals("[[-1,-1,2],[-1,0,1]]", jsonString);
	}

	@Test
	public void test2() {
		int[] nums = {0,1,1};
		List<List<Integer>> res1 = solution.threeSum(nums);
		String jsonString = JSONArray.toJSONString(res1);
		System.out.println(jsonString);
		Assertions.assertEquals("[]", jsonString);
	}

}