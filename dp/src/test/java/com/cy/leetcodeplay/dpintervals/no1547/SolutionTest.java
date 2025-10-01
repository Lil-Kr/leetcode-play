package com.cy.leetcodeplay.dpintervals.no1547;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
	private Solution solution = new Solution();

	@Test
	public void test1() {
		int n = 7;
		int[] cuts = {1, 3, 4, 5};
		int res = solution.minCost(n, cuts);
		Assertions.assertEquals(16, res);
	}

	@Test
	public void test2() {
		int n = 9;
		int[] cuts = {5,6,1,4,2};
		int res = solution.minCost(n, cuts);
		Assertions.assertEquals(22, res);
	}

	// =============== dp ==============

	@Test
	public void test21() {
		int n = 7;
		int[] cuts = {1, 3, 4, 5};
		int res = solution.minCost2(n, cuts);
		Assertions.assertEquals(16, res);
	}

	@Test
	public void test22() {
		int n = 9;
		int[] cuts = {5,6,1,4,2};
		int res = solution.minCost2(n, cuts);
		Assertions.assertEquals(22, res);
	}
}