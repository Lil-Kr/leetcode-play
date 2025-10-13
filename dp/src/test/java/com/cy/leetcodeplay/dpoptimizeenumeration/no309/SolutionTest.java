package com.cy.leetcodeplay.dpoptimizeenumeration.no309;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {
	private Solution solution = new Solution();

	@Test
	public void test1() {
		int[] prices = {1, 2, 3, 0, 2};
		int res = solution.maxProfit(prices);
		Assertions.assertEquals(3, res);
	}

	@Test
	public void test2() {
		int[] prices = {1};
		int res = solution.maxProfit(prices);
		Assertions.assertEquals(0, res);
	}


	@Test
	public void test21() {
		int[] prices = {1, 2, 3, 0, 2};
		int res = solution.maxProfit2(prices);
		Assertions.assertEquals(3, res);
	}

	@Test
	public void test22() {
		int[] prices = {1};
		int res = solution.maxProfit2(prices);
		Assertions.assertEquals(0, res);
	}
}