package com.cy.leetcodeplay.array.no189;

import com.alibaba.fastjson2.JSONArray;
import com.cy.leetcodeplay.array.no189.Solution;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

	private Solution solution = new Solution();

	@Test
	public void test1() {
		int[] nums = {1, 2, 3, 4, 5, 6, 7};
		int k = 3;
		solution.rotate(nums, k);

		Assertions.assertEquals("[5,6,7,1,2,3,4]", JSONArray.toJSONString(nums));
	}
}