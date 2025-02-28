package com.cy.leetcodeplay.array.no74;

import com.cy.leetcodeplay.array.no74.Solution;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

	private Solution solution = new Solution();

	@Test
	public void test1() {
		int[][] matrix = {{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 60}};
		int target = 3;
		boolean res1 = solution.searchMatrix(matrix, target);
		Assertions.assertEquals(true, res1);
	}

	@Test
	public void test2() {
		int[][] matrix = {{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 60}};
		int target = 13;
		boolean res1 = solution.searchMatrix(matrix, target);
		Assertions.assertEquals(false, res1);
	}
}