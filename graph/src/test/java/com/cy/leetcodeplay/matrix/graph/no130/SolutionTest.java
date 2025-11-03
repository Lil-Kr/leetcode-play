package com.cy.leetcodeplay.matrix.graph.no130;

import com.alibaba.fastjson2.JSONArray;
import com.cy.leetcodeplay.graph.no130.Solution;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

	private Solution solution = new Solution();

	@Test
	public void test1() {
		char[][] board = {{'X','X','X','X'},{'X','O','O','X'},{'X','X','O','X'},{'X','O','X','X'}};

		solution.solve(board);
		Assertions.assertEquals("[\"XXXX\",\"XXXX\",\"XXXX\",\"XOXX\"]", JSONArray.toJSONString(board));
	}

	@Test
	public void test21() {
		char[][] board = {{'X','X','X','X'},{'X','O','O','X'},{'X','X','O','X'},{'X','O','X','X'}};

		solution.solve2(board);
		Assertions.assertEquals("[\"XXXX\",\"XXXX\",\"XXXX\",\"XOXX\"]", JSONArray.toJSONString(board));
	}

	@Test
	public void test22() {
		char[][] board = {{'X'}};

		solution.solve2(board);
		Assertions.assertEquals("[\"X\"]", JSONArray.toJSONString(board));
	}

	@Test
	public void test23() {
		char[][] board = {{'O', 'O'}};
		solution.solve2(board);
		Assertions.assertEquals("[\"OO\"]", JSONArray.toJSONString(board));
	}
}