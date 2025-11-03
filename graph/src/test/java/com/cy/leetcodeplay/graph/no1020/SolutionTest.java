package com.cy.leetcodeplay.graph.no1020;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
	private Solution solution = new Solution();

	@Test
	public void test1() {
		int[][] grid = {{0, 0, 0, 0}, {1, 0, 1, 0}, {0, 1, 1, 0}, {0, 0, 0, 0}};
		int res = solution.numEnclaves(grid);
		Assertions.assertEquals(3, res);
	}

	@Test
	public void test2() {
		int[][] grid = {{0, 1, 1, 0}, {0, 0, 1, 0}, {0, 0, 1, 0}, {0, 0, 0, 0}};
		int res = solution.numEnclaves(grid);
		Assertions.assertEquals(0, res);
	}
}