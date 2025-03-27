package com.cy.leetcodeplay.array.no31;

import com.alibaba.fastjson2.JSONArray;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

	private Solution solution = new Solution();

	@Test
	public void test1() {
		int[] nums = {1, 2, 3};
		solution.nextPermutation(nums);
		Assertions.assertEquals("[1,3,2]", JSONArray.toJSONString(nums));
	}

	@Test
	public void test2() {
		int[] nums = {3,2,1};
		solution.nextPermutation(nums);
		Assertions.assertEquals("[1,2,3]", JSONArray.toJSONString(nums));
	}

	@Test
	public void test3() {
		int[] nums = {1,1,5};
		solution.nextPermutation(nums);
		Assertions.assertEquals("[1,5,1]", JSONArray.toJSONString(nums));
	}
}