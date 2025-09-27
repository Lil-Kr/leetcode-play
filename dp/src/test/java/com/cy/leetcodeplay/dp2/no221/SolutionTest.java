package com.cy.leetcodeplay.dp2.no221;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
	private Solution solution = new Solution();

	@Test
	public void test1() {
		char[][] matrix = {{'1', '0', '1', '0', '0'}, {'1', '0', '1', '1', '1'}, {'1', '1', '1', '1', '1'}, {'1', '0', '0', '1', '0'}};
		int res = solution.maximalSquare(matrix);
		Assertions.assertEquals(4, res);
	}

	@Test
	public void test2() {
		char[][] matrix = {{'0', '1'}, {'1', '0'}};
		int res = solution.maximalSquare(matrix);
		Assertions.assertEquals(1, res);
	}

	// ================== dp ==================

	@Test
	public void test11() {
		char[][] matrix = {{'1', '0', '1', '0', '0'}, {'1', '0', '1', '1', '1'}, {'1', '1', '1', '1', '1'}, {'1', '0', '0', '1', '0'}};
		int res = solution.maximalSquare2(matrix);
		Assertions.assertEquals(4, res);
	}

	@Test
	public void test12() {
		char[][] matrix = {{'0', '1'}, {'1', '0'}};
		int res = solution.maximalSquare2(matrix);
		Assertions.assertEquals(1, res);
	}

	// ================== dp2 ==================

	@Test
	public void test21() {
		char[][] matrix = {{'1', '0', '1', '0', '0'}, {'1', '0', '1', '1', '1'}, {'1', '1', '1', '1', '1'}, {'1', '0', '0', '1', '0'}};
		int res = solution.maximalSquare3(matrix);
		Assertions.assertEquals(4, res);
	}

	@Test
	public void test22() {
		char[][] matrix = {{'0', '1'}, {'1', '0'}};
		int res = solution.maximalSquare3(matrix);
		Assertions.assertEquals(1, res);
	}
}