package com.cy.leetcodeplay.dp.no64;

import com.cy.leetcodeplay.dp.no64.Solution;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

	private Solution solution = new Solution();

	@Test
	public void test1() {
		int[][] grid = {{1, 3, 1}, {1, 5, 1}, {4, 2, 1}};
		int res1 = solution.minPathSum2(grid);
		Assertions.assertEquals(7, res1);
	}

	@Test
	public void test2() {
		int[][] grid = {{1, 3, 1}, {1, 5, 1}, {4, 2, 1}};
		int res1 = solution.minPathSum3(grid);
		Assertions.assertEquals(7, res1);
	}

	@Test
	public void test3() {
		int[][] grid = {{1, 3, 1}, {1, 5, 1}, {4, 2, 1}};
		int res1 = solution.minPathSum4(grid);
		Assertions.assertEquals(7, res1);
	}
}