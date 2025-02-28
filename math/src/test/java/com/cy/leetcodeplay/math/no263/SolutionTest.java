package com.cy.leetcodeplay.math.no263;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

	private Solution solution = new Solution();

	@Test
	public void test1() {
		int n = 6;
		boolean res1 = solution.isUgly(n);
		Assertions.assertEquals(true, res1);
	}

	@Test
	public void test2() {
		int n = 1;
		boolean res1 = solution.isUgly(n);
		Assertions.assertEquals(true, res1);
	}

	@Test
	public void test3() {
		int n = 14;
		boolean res1 = solution.isUgly(n);
		Assertions.assertEquals(false, res1);
	}
}