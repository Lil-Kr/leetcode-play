package com.cy.leetcodeplay.dplis.no673;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

	private Solution solution = new Solution();

	@Test
	public void test1() {
		int[] nums = {1, 3, 5, 4, 7};
		int res = solution.findNumberOfLIS(nums);
		Assertions.assertEquals(2, res);
	}
}