package com.cy.leetcodeplay.dp1.no1137;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {
	private Solution solution = new Solution();

	@Test
	public void test1() {
		int n = 4;
		int res = solution.tribonacci(n);
		Assertions.assertEquals(4, res);
	}

	@Test
	public void test2() {
		int n = 25;
		int res = solution.tribonacci(n);
		Assertions.assertEquals(1389537, res);
	}

	@Test
	public void test3() {
		int n = 1;
		int res = solution.tribonacci(n);
		Assertions.assertEquals(1, res);

		n = 2;
		res = solution.tribonacci(n);
		Assertions.assertEquals(1, res);
	}
}