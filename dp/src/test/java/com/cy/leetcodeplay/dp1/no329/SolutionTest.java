package com.cy.leetcodeplay.dp1.no329;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

	private Solution solution = new Solution();

	@Test
	public void test1() {
		int[][] matrix = {{9, 9, 4}, {6, 6, 8}, {2, 1, 1}};
		int res = solution.longestIncreasingPath(matrix);
		Assertions.assertEquals(4, res);
	}

	@Test
	public void test2() {
		int[][] matrix = {{3, 4, 5}, {3, 2, 6}, {2, 2, 1}};
		int res = solution.longestIncreasingPath(matrix);
		Assertions.assertEquals(4, res);
	}

	@Test
	public void test3() {
		int[][] matrix = {{9, 9, 4}, {6, 6, 8}, {2, 1, 1}};
		int res = solution.longestIncreasingPath(matrix);
		Assertions.assertEquals(4, res);
	}

	@Test
	public void test4() {
		int[][] matrix = {{3, 4, 5}, {3, 2, 6}, {2, 2, 1}};
		int res = solution.longestIncreasingPath(matrix);
		Assertions.assertEquals(4, res);
	}

}