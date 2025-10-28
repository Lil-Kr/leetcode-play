package com.cy.leetcodeplay.dp01package.no1049;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {
	private Solution solution = new Solution();

	@Test
	public void test1() {
		int[] stones = {2, 7, 4, 1, 8, 1};
		int res = solution.lastStoneWeightII(stones);
		Assertions.assertEquals(1, res);
	}

	@Test
	public void test2() {
		int[] stones = {31, 26, 33, 21, 40};
		int res = solution.lastStoneWeightII(stones);
		Assertions.assertEquals(5, res);
	}

	@Test
	public void test3() {
		int[] stones = {5, 2, 3};
		int res = solution.lastStoneWeightII(stones);
		Assertions.assertEquals(0, res);
	}

	@Test
	public void test4() {
		int[] stones = {5};
		int res = solution.lastStoneWeightII(stones);
		Assertions.assertEquals(5, res);
	}

	// =================== dp ===================
	@Test
	public void test21() {
		int[] stones = {2, 7, 4, 1, 8, 1};
		int res = solution.lastStoneWeightII2(stones);
		Assertions.assertEquals(1, res);
	}

	@Test
	public void test22() {
		int[] stones = {31, 26, 33, 21, 40};
		int res = solution.lastStoneWeightII2(stones);
		Assertions.assertEquals(5, res);
	}

	@Test
	public void test23() {
		int[] stones = {5, 2, 3};
		int res = solution.lastStoneWeightII2(stones);
		Assertions.assertEquals(0, res);
	}

	@Test
	public void test24() {
		int[] stones = {5};
		int res = solution.lastStoneWeightII2(stones);
		Assertions.assertEquals(5, res);
	}
}