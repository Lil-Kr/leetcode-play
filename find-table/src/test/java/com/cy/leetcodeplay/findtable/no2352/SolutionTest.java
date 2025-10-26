package com.cy.leetcodeplay.findtable.no2352;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {
	private Solution solution = new Solution();

	@Test
	public void test1() {
		int[][] grid = {{3, 2, 1}, {1, 7, 6}, {2, 7, 7}};
		int res = solution.equalPairs(grid);
		Assertions.assertEquals(1, res);
	}

	@Test
	public void test2() {
		int[][] grid = {{3, 1, 2, 2}, {1, 4, 4, 5}, {2, 4, 2, 2}, {2, 4, 2, 2}};
		int res = solution.equalPairs(grid);
		Assertions.assertEquals(3, res);
	}
}