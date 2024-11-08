package com.cy.leetcodeplay.dp.no264;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

	private Solution solution = new Solution();

	@Test
	public void test1() {
		int n = 10;
		int res1 = solution.nthUglyNumber2(n);
		Assertions.assertEquals(12, res1);
	}

	@Test
	public void test2() {
		int n = 1;
		int res1 = solution.nthUglyNumber2(n);
		Assertions.assertEquals(1, res1);
	}

	@Test
	public void test3() {
		int n = 37;
		int res1 = solution.nthUglyNumber2(n);
		Assertions.assertEquals(125, res1);
	}

	@Test
	public void test4() {
		int n = 1432;
		int res1 = solution.nthUglyNumber2(n);
		Assertions.assertEquals(612220032, res1);
	}
}