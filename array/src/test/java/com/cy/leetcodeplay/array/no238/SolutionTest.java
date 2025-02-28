package com.cy.leetcodeplay.array.no238;

import com.alibaba.fastjson2.JSONArray;
import com.cy.leetcodeplay.array.no238.Solution;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

	private Solution solution = new Solution();

	@Test
	public void test1() {
		int[] nums = {1,2,3,4};
		int[] res1 = solution.productExceptSelf(nums);

		Assertions.assertEquals("[24,12,8,6]", JSONArray.toJSONString(res1));
	}
}