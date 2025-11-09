package com.cy.leetcodeplay.array.no34;

import com.alibaba.fastjson2.JSONArray;
import com.cy.leetcodeplay.common.util.PrintString;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

	private Solution solution = new Solution();

	@Test
	public void test1() {
		int[] nums = {5, 7, 7, 8, 8, 10};
		int target = 8;
		int[] res = solution.searchRange(nums, target);
		Assertions.assertEquals("[3,4]", JSONArray.toJSONString(res));
	}

	@Test
	public void test2() {
		int[] nums = {5, 7, 7, 8, 8, 10};
		int target = 6;
		int[] res = solution.searchRange(nums, target);
		Assertions.assertEquals("[-1,-1]", JSONArray.toJSONString(res));
	}

	@Test
	public void test3() {
		int[] nums = {};
		int target = 0;
		int[] res = solution.searchRange(nums, target);
		Assertions.assertEquals("[-1,-1]", JSONArray.toJSONString(res));
	}

	@Test
	public void test21() {
		int[] nums = {5, 7, 7, 8, 8, 10};
		int target = 8;
		int[] res = solution.searchRange2(nums, target);
		Assertions.assertEquals("[3,4]", JSONArray.toJSONString(res));
	}

	@Test
	public void test22() {
		int[] nums = {5, 7, 7, 8, 8, 10};
		int target = 6;
		int[] res = solution.searchRange2(nums, target);
		Assertions.assertEquals("[-1,-1]", JSONArray.toJSONString(res));
	}

	@Test
	public void test23() {
		int[] nums = {};
		int target = 0;
		int[] res = solution.searchRange2(nums, target);
		Assertions.assertEquals("[-1,-1]", JSONArray.toJSONString(res));
	}
}