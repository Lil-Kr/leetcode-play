package com.cy.leetcodeplay.array.no122;

import com.cy.leetcodeplay.array.no122.Solution;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

	private Solution solution = new Solution();

	@Test
	public void test_1() {
		int[] prices = new int[]{7,1,5,3,6,4};
		int res = solution.maxProfit(prices);
		System.out.println(res);
		Assertions.assertEquals(res, 7);
	}

}