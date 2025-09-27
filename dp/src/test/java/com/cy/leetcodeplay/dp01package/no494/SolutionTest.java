package com.cy.leetcodeplay.dp01package.no494;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {
	private Solution solution = new Solution();

	@Test
	public void test1() {
		int[] nums = {1, 1, 1, 1, 1};
		int target = 3;
		int res = solution.findTargetSumWays(nums, target);
		Assertions.assertEquals(5, res);
	}

	@Test
	public void test2() {
		int[] nums = {3, 1, 1, 2};
		int target = 1;
		int res = solution.findTargetSumWays(nums, target);
		Assertions.assertEquals(3, res);
	}

	@Test
	public void test3() {
		int[] nums = {1};
		int target = 1;
		int res = solution.findTargetSumWays(nums, target);
		Assertions.assertEquals(1, res);
	}
}