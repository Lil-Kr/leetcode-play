package com.cy.leetcodeplay.matrix.backtracking.no51;

import com.alibaba.fastjson2.JSONArray;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.List;

class SolutionTest {

	private Solution solution = new Solution();

	@Test
	public void test1() {
		int n = 4;
		List<List<String>> res1 = solution.solveNQueens(n);
		printNQueens(res1);

		Assertions.assertEquals("[[\".Q..\",\"...Q\",\"Q...\",\"..Q.\"],[\"..Q.\",\"Q...\",\"...Q\",\".Q..\"]]", JSONArray.toJSONString(res1));
	}

	@Test
	public void test2() {
		int n = 8;
		List<List<String>> res1 = solution.solveNQueens(n);
		printNQueens(res1);
	}

	/**
	 * 打印
	 * @param res
	 */
	private static void printNQueens(List<List<String>> res) {
		for(List<String> board: res)
			printBoard(board);
	}

	private static void printBoard(List<String> board) {
		for(String s: board)
			System.out.println(s);
		System.out.println();
	}
}