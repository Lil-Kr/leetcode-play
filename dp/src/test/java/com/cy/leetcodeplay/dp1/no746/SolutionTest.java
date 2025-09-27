package com.cy.leetcodeplay.dp1.no746;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {
	private Solution solution = new Solution();

	@Test
	public void test1() {
		int[] cost = {10,15,20};
		int res = solution.minCostClimbingStairs3(cost);
		Assertions.assertEquals(15, res);
	}

	@Test
	public void test2() {
		int[] cost = {1,100,1,1,1,100,1,1,100,1};
		int res = solution.minCostClimbingStairs3(cost);
		Assertions.assertEquals(6, res);
	}
}