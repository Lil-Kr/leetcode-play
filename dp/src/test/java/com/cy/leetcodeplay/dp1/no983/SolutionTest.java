package com.cy.leetcodeplay.dp1.no983;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
	private Solution solution = new Solution();

	@Test
	public void test1() {
		int[] days = {1, 4, 6, 7, 8, 20}, costs = {2, 7, 15};
		int res = solution.mincostTickets3(days, costs);
		Assertions.assertEquals(11, res);
	}

	@Test
	public void test2() {
		int[] days = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 30, 31}, costs = {2, 7, 15};
		int res = solution.mincostTickets3(days, costs);
		Assertions.assertEquals(17, res);
	}
}