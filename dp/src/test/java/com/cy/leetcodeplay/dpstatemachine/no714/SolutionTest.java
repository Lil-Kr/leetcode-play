package com.cy.leetcodeplay.dpstatemachine.no714;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
	private Solution solution = new Solution();

	@Test
	public void test1() {
		int[] prices = {1, 3, 2, 8, 4, 9};
		int fee = 2;
		int res = solution.maxProfit(prices, fee);
		Assertions.assertEquals(8, res);
	}
}