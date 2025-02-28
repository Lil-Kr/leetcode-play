package com.cy.leetcodeplay.matrix.graph.no130;

import com.alibaba.fastjson2.JSONArray;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

	private Solution solution = new Solution();

	@Test
	public void test1() {
		char[][] board = {{'X','X','X','X'},{'X','O','O','X'},{'X','X','O','X'},{'X','O','X','X'}};

		solution.solve(board);
//		System.out.println(JSONArray.toJSONString(board));
		Assertions.assertEquals("[\"XXXX\",\"XXXX\",\"XXXX\",\"XOXX\"]", JSONArray.toJSONString(board));
	}
}