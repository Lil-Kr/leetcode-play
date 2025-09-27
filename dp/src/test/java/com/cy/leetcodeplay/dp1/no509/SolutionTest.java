package com.cy.leetcodeplay.dp1.no509;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {
	private Solution solution = new Solution();

	@Test
	public void test1() {
		int n = 2;
		int res = solution.fib3(n);
		Assertions.assertEquals(1, res);
	}

	@Test
	public void test2() {
		int n = 3;
		int res = solution.fib3(n);
		Assertions.assertEquals(2, res);
	}

	@Test
	public void test3() {
		int n = 4;
		int res = solution.fib3(n);
		Assertions.assertEquals(3, res);
	}

	@Test
	public void test4() {
		int n = 4;
		int res = solution.fib4(n);
		Assertions.assertEquals(3, res);
	}
}