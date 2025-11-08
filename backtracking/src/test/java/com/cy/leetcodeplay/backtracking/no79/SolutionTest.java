package com.cy.leetcodeplay.backtracking.no79;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

	private Solution solution = new Solution();

	@Test
	public void test1() {
		char[][] board = {{'A', 'B', 'C', 'E'}, {'S', 'F', 'C', 'S'}, {'A', 'D', 'E', 'E'}};
		String word = "ABCCED";
		boolean res1 = solution.exist(board, word);
		Assertions.assertEquals(true, res1);
	}

	@Test
	public void test2() {
		char[][] board = {{'A', 'B', 'C', 'E'}, {'S', 'F', 'C', 'S'}, {'A', 'D', 'E', 'E'}};
		String word = "SEE";
		boolean res1 = solution.exist(board, word);
		Assertions.assertEquals(true, res1);
	}

	@Test
	public void test3() {
		char[][] board = {{'A', 'B', 'C', 'E'}, {'S', 'F', 'C', 'S'}, {'A', 'D', 'E', 'E'}};
		String word = "ABCB";
		boolean res1 = solution.exist(board, word);
		Assertions.assertEquals(false, res1);
	}

	@Test
	public void test21() {
		char[][] board = {{'A', 'B', 'C', 'E'}, {'S', 'F', 'C', 'S'}, {'A', 'D', 'E', 'E'}};
		String word = "ABCCED";
		boolean res1 = solution.exist2(board, word);
		Assertions.assertEquals(true, res1);
	}

	@Test
	public void test22() {
		char[][] board = {{'A', 'B', 'C', 'E'}, {'S', 'F', 'C', 'S'}, {'A', 'D', 'E', 'E'}};
		String word = "SEE";
		boolean res1 = solution.exist2(board, word);
		Assertions.assertEquals(true, res1);
	}

	@Test
	public void test23() {
		char[][] board = {{'A', 'B', 'C', 'E'}, {'S', 'F', 'C', 'S'}, {'A', 'D', 'E', 'E'}};
		String word = "ABCB";
		boolean res1 = solution.exist2(board, word);
		Assertions.assertEquals(false, res1);
	}
}