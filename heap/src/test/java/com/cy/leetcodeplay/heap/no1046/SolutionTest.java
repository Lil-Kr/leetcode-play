package com.cy.leetcodeplay.heap.no1046;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class SolutionTest {

	private Solution solution = new Solution();

	@Test
	public void test1() {
		int[] stones = {2, 7, 4, 1, 8, 1};
		int res = solution.lastStoneWeight(stones);
		Assertions.assertEquals(1, res);
	}

	@Test
	public void test2() {
		int[] stones = {3,7,2};
		int res = solution.lastStoneWeight(stones);
		Assertions.assertEquals(2, res);
	}

	@Test
	public void test3() {
		int[] stones = {7, 6, 7, 6, 9};
		int res = solution.lastStoneWeight(stones);
		Assertions.assertEquals(3, res);
	}
}