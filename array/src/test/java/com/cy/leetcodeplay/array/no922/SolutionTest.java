package com.cy.leetcodeplay.array.no922;

import com.alibaba.fastjson2.JSONArray;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {
	private Solution solution = new Solution();

	@Test
	public void test1() {
		int[] nums = {4,2,5,7};
		int[] res = solution.sortArrayByParityII(nums);
		Assertions.assertEquals("[2,7,4,5]", JSONArray.toJSONString(res));
	}
}