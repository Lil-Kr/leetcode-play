package com.cy.leetcodeplay.dpintervals.no312;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {
	private Solution solution = new Solution();

	@Test
	public void test1() {
		int[] nums = {3,1,5,8};
		int res = solution.maxCoins(nums);
		Assertions.assertEquals(167, res);
	}

	@Test
	public void test2() {
		int[] nums = {1,5};
		int res = solution.maxCoins(nums);
		Assertions.assertEquals(10, res);
	}

	// ============ dp =============

	@Test
	public void test21() {
		int[] nums = {3,1,5,8};
		int res = solution.maxCoins2(nums);
		Assertions.assertEquals(167, res);
	}

	@Test
	public void test22() {
		int[] nums = {1,5};
		int res = solution.maxCoins2(nums);
		Assertions.assertEquals(10, res);
	}
}