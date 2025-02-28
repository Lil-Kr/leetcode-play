package com.cy.leetcodeplay.matrix.dp.no213;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {
	private Solution solution = new Solution();

	@Test
	public void test1() {
		int[] nums = {2,3,2};
		int res1 = solution.rob(nums);
		Assertions.assertEquals(3, res1);
	}

	@Test
	public void test2() {
		int[] nums = {1,2,3,1};
		int res1 = solution.rob(nums);
		Assertions.assertEquals(4, res1);
	}

	@Test
	public void test3() {
		int[] nums = {1,2,3};
		int res1 = solution.rob(nums);
		Assertions.assertEquals(3, res1);
	}
}