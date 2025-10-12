package com.cy.leetcodeplay.dpstatemachine.no188;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
	private Solution solution = new Solution();

	@Test
	public void test1() {
		int k = 2;
		int[] prices = {2, 4, 1};
		int res = solution.maxProfit(k, prices);
		Assertions.assertEquals(2, res);
	}

	@Test
	public void test2() {
		int k = 2;
		int[] prices = {3, 3, 5, 0, 0, 3, 1, 4};
		int res = solution.maxProfit(k, prices);
		Assertions.assertEquals(6, res);
	}

	// ================ dp ===============

	@Test
	public void test21() {
		int k = 2;
		int[] prices = {2, 4, 1};
		int res = solution.maxProfit2(k, prices);
		Assertions.assertEquals(2, res);
	}

	@Test
	public void test22() {
		int k = 2;
		int[] prices = {3, 3, 5, 0, 0, 3, 1, 4};
		int res = solution.maxProfit2(k, prices);
		Assertions.assertEquals(6, res);
	}
}