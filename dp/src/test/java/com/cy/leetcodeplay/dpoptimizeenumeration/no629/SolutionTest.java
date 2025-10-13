package com.cy.leetcodeplay.dpoptimizeenumeration.no629;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
	private Solution solution = new Solution();

	@Test
	public void test1() {
		int n = 3, k = 0;
		int res = solution.kInversePairs(n, k);
		Assertions.assertEquals(1, res);
	}

	@Test
	public void test2() {
		int n = 3, k = 1;
		int res = solution.kInversePairs(n, k);
		Assertions.assertEquals(2, res);
	}

	@Test
	public void test3() {
		int n = 10, k = 2;
		int res = solution.kInversePairs(n, k);
		Assertions.assertEquals(44, res);
	}

	// ============= optimize =============

	@Test
	public void test21() {
		int n = 3, k = 0;
		int res = solution.kInversePairs2(n, k);
		Assertions.assertEquals(1, res);
	}

	@Test
	public void test22() {
		int n = 3, k = 1;
		int res = solution.kInversePairs2(n, k);
		Assertions.assertEquals(2, res);
	}

	@Test
	public void test23() {
		int n = 10, k = 2;
		int res = solution.kInversePairs2(n, k);
		Assertions.assertEquals(44, res);
	}
}