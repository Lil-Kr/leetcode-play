package com.cy.leetcodeplay.greedy.no1553;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {
	private Solution solution = new Solution();

	@Test
	public void test1() {
		int n = 10;
		int res = solution.minDays(n);
		Assertions.assertEquals(4, res);
	}

	@Test
	public void test2() {
		int n = 6;
		int res = solution.minDays(n);
		Assertions.assertEquals(3, res);
	}
}