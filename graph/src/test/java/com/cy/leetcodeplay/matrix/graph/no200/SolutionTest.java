package com.cy.leetcodeplay.matrix.graph.no200;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

	private Solution solution = new Solution();

	@Test
	public void test1() {
		char[][] grid = {
			{'1','1','1','1','0'},
			{'1','1','0','1','0'},
			{'1','1','0','0','0'},
			{'0','0','0','0','0'},
		};

		int res1 = solution.numIslands(grid);
		Assertions.assertEquals(1, res1);
	}

	@Test
	public void test2() {
		char[][] grid = {
			{'1','1','0','0','0'},
			{'1','1','0','0','0'},
			{'0','0','1','0','0'},
			{'0','0','0','1','1'},
		};

		int res1 = solution.numIslands(grid);
		Assertions.assertEquals(3, res1);
	}
}