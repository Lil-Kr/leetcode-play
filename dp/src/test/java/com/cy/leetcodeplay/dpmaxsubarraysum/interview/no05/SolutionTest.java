package com.cy.leetcodeplay.dpmaxsubarraysum.interview.no05;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {
	private Solution solution = new Solution();

	@Test
	public void test1() {
		int[] nums = {-7, 5, 4, -100, -50, 6, 3, -9, -8, -7};
		int res = solution.maxSumReverse(nums);
		Assertions.assertEquals(18, res);
	}
}