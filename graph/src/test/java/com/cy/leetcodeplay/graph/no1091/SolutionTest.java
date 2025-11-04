package com.cy.leetcodeplay.graph.no1091;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

	private Solution solution = new Solution();

	@Test
	public void test1() {
		int[][] grid = {{0, 1}, {1, 0}};
		int res = solution.shortestPathBinaryMatrix(grid);
		Assertions.assertEquals(2, res);
	}

	@Test
	public void test2() {
		int[][] grid = {{0, 0, 0}, {1, 1, 0}, {1, 1, 0}};
		int res = solution.shortestPathBinaryMatrix(grid);
		Assertions.assertEquals(4, res);
	}

	@Test
	public void test3() {
		int[][] grid = {{1, 0, 0}, {1, 1, 0}, {1, 1, 0}};
		int res = solution.shortestPathBinaryMatrix(grid);
		Assertions.assertEquals(-1, res);
	}
}