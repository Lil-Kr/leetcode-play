package com.cy.leetcodeplay.greedy.no134;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {
	private Solution solution = new Solution();

	@Test
	public void test1() {
		int[] gas = {1, 2, 3, 4, 5};
		int[] cost = {3, 4, 5, 1, 2};
		int res = solution.canCompleteCircuit(gas, cost);
		Assertions.assertEquals(3, res);
	}

	@Test
	public void test2() {
		int[] gas = {2, 3, 4};
		int[] cost = {3, 4, 3};
		int res = solution.canCompleteCircuit(gas, cost);
		Assertions.assertEquals(-1, res);
	}
}