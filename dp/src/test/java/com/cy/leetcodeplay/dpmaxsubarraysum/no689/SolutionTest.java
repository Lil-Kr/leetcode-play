package com.cy.leetcodeplay.dpmaxsubarraysum.no689;

import com.alibaba.fastjson2.JSONArray;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {
	private Solution solution = new Solution();

	@Test
	public void test1() {
		int[] nums = {1,2,1,2,6,7,5,1};
		int k = 2;
		int[] res = solution.maxSumOfThreeSubarrays(nums, k);
		Assertions.assertEquals("[0,3,5]", JSONArray.toJSONString(res));
	}

	@Test
	public void test2() {
		int[] nums = {1,2,1,2,1,2,1,2,1};
		int k = 2;
		int[] res = solution.maxSumOfThreeSubarrays(nums, k);
		Assertions.assertEquals("[0,2,4]", JSONArray.toJSONString(res));
	}
}