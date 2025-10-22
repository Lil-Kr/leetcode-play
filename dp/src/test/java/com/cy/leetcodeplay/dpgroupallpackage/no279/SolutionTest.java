package com.cy.leetcodeplay.dpgroupallpackage.no279;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {
	private Solution solution = new Solution();

	@Test
	public void test1() {
		int n = 12;
		int res = solution.numSquares(n);
		Assertions.assertEquals(3, res);
	}

	@Test
	public void test2() {
		int n = 27;
		int res = solution.numSquares(n);
		Assertions.assertEquals(3, res);
	}

	@Test
	public void test3() {
		int n = 29;
		int res = solution.numSquares(n);
		Assertions.assertEquals(2, res);
	}

	// ================= dp =================

	@Test
	public void test4() {
		int n = 12;
		int res = solution.numSquares2(n);
		Assertions.assertEquals(3, res);
	}

	@Test
	public void test5() {
		int n = 27;
		int res = solution.numSquares2(n);
		Assertions.assertEquals(3, res);
	}

	@Test
	public void test6() {
		int n = 29;
		int res = solution.numSquares2(n);
		Assertions.assertEquals(2, res);
	}
}