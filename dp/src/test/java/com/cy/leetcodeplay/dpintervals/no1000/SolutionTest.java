package com.cy.leetcodeplay.dpintervals.no1000;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
	private Solution solution = new Solution();

	@Test
	public void test1() {
		int[] stones = {3,2,4,1};
		int k = 2;
		int res = solution.mergeStones(stones, k);
		Assertions.assertEquals(20, res);
	}

	@Test
	public void test2() {
		int[] stones = {3,2,4};
		int k = 3;
		int res = solution.mergeStones(stones, k);
		Assertions.assertEquals(9, res);
	}

	// =============== dp ================

	@Test
	public void test21() {
		int[] stones = {3,2,4,1};
		int k = 2;
		int res = solution.mergeStones2(stones, k);
		Assertions.assertEquals(20, res);
	}

	@Test
	public void test22() {
		int[] stones = {3,2,4};
		int k = 3;
		int res = solution.mergeStones2(stones, k);
		Assertions.assertEquals(9, res);
	}
}