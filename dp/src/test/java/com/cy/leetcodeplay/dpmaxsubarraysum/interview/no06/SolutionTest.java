package com.cy.leetcodeplay.dpmaxsubarraysum.interview.no06;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

	private Solution solution = new Solution();

	@Test
	public void test1() {
		int[] nums = {-6, 7, 5, -2, 4, 3, -7};
		int k = 3;
		int res = solution.maxSum(nums, k);
		Assertions.assertEquals(16, res);
	}
}