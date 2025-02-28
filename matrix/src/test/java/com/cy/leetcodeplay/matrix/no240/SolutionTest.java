package com.cy.leetcodeplay.matrix.no240;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

	private Solution solution = new Solution();

	@Test
	public void test1() {
		int[][] matrix = {{1,4,7,11,15},{2,5,8,12,19},{3,6,9,16,22},{10,13,14,17,24},{18,21,23,26,30}};
		int target = 12;
		boolean res1 = solution.searchMatrix(matrix, target);
		Assertions.assertEquals(true, res1);
	}

	@Test
	public void test2() {
		int[][] matrix = {{1,4,7,11,15},{2,5,8,12,19},{3,6,9,16,22},{10,13,14,17,24},{18,21,23,26,30}};
		int target = 20;
		boolean res1 = solution.searchMatrix(matrix, target);

		Assertions.assertEquals(false, res1);
	}

	@Test
	public void test3() {
		int[][] matrix = {{-5}};
		int target = -5;
		boolean res1 = solution.searchMatrix(matrix, target);

		Assertions.assertEquals(true, res1);
	}
}