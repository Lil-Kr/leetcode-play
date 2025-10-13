package com.cy.leetcodeplay.dpoptimizeenumeration.no122;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {
	private Solution solution = new Solution();

	@Test
	public void test1() {
		int[] prices = {7,1,5,3,6,4};
		int res = solution.maxProfit(prices);
		Assertions.assertEquals(7, res);
	}

	@Test
	public void test2() {
		int[] prices = {1,2,3,4,5};
		int res = solution.maxProfit(prices);
		Assertions.assertEquals(4, res);
	}

	@Test
	public void test3() {
		int[] prices = {7,6,4,3,1};
		int res = solution.maxProfit(prices);
		Assertions.assertEquals(0, res);
	}
}