package com.cy.leetcodeplay.stack.no739;

import com.alibaba.fastjson2.JSONArray;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

	private Solution solution = new Solution();

	@Test
	public void test1() {
		int[] nums = {73, 74, 75, 71, 69, 72, 76, 73};
		int[] res1 = solution.dailyTemperatures(nums);
		System.out.println(JSONArray.toJSONString(res1));
		Assertions.assertEquals("[1,1,4,2,1,1,0,0]", JSONArray.toJSONString(res1));
	}
}