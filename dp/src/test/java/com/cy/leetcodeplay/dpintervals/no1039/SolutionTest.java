package com.cy.leetcodeplay.dpintervals.no1039;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
	private Solution solution = new Solution();

	@Test
	public void test1() {
		int[] values = {1, 2, 3};
		int res = solution.minScoreTriangulation(values);
		Assertions.assertEquals(6, res);
	}

	@Test
	public void test2() {
		int[] values = {3,7,4,5};
		int res = solution.minScoreTriangulation(values);
		Assertions.assertEquals(144, res);
	}

	@Test
	public void test3() {
		int[] values = {1, 3, 1, 4, 1, 5};
		int res = solution.minScoreTriangulation(values);
		Assertions.assertEquals(13, res);
	}

	// ====================== dp ====================

	@Test
	public void test21() {
		int[] values = {1, 2, 3};
		int res = solution.minScoreTriangulation2(values);
		Assertions.assertEquals(6, res);
	}

	@Test
	public void test22() {
		int[] values = {3,7,4,5};
		int res = solution.minScoreTriangulation2(values);
		Assertions.assertEquals(144, res);
	}

	@Test
	public void test23() {
		int[] values = {1, 3, 1, 4, 1, 5};
		int res = solution.minScoreTriangulation2(values);
		Assertions.assertEquals(13, res);
	}
}