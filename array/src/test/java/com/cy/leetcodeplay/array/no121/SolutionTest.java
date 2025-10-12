package com.cy.leetcodeplay.array.no121;

import com.cy.leetcodeplay.array.no121.Solution;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

	private Solution solution = new Solution();

	@Test
	public void test1() {
		int[] prices = new int[]{7,1,5,3,6,4};
		int res = solution.maxProfit(prices);
		Assertions.assertEquals(5, res);
	}

	@Test
	public void test2() {
		int[] prices = new int[]{7,1,5,3,6,4};
		int res = solution.maxProfit2(prices);
		Assertions.assertEquals(5, res);
	}
}