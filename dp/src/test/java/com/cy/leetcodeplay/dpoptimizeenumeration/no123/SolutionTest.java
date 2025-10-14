package com.cy.leetcodeplay.dpoptimizeenumeration.no123;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {
	private Solution solution = new Solution();

	@Test
	public void test1() {
		int[] prices = {3, 3, 5, 0, 0, 3, 1, 4};
		int res = solution.maxProfit2(prices);
		Assertions.assertEquals(6, res);
	}

	@Test
	public void test2() {
		int[] prices = {3, 3, 5, 0, 0, 3, 1, 4};
		int res = solution.maxProfit4(prices);
		Assertions.assertEquals(6, res);
	}
}