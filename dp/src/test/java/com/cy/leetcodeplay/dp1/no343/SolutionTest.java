package com.cy.leetcodeplay.dp1.no343;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
	private Solution solution = new Solution();

	@Test
	public void test1() {
		int n = 2;
		int res = solution.integerBreak(n);
		Assertions.assertEquals(1, res);
	}

	@Test
	public void test2() {
		int n = 10;
		int res = solution.integerBreak(n);
		Assertions.assertEquals(36, res);
	}

	// ============== dp ==============
	@Test
	public void test3() {
		int n = 2;
		int res = solution.integerBreak2(n);
		Assertions.assertEquals(1, res);
	}

	@Test
	public void test4() {
		int n = 10;
		int res = solution.integerBreak2(n);
		Assertions.assertEquals(36, res);
	}
}