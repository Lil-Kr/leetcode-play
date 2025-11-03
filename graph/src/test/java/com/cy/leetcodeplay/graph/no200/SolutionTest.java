package com.cy.leetcodeplay.graph.no200;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
	private Solution solution = new Solution();

	@Test
	public void test1() {
		char[][] grid = {
			{'1', '1', '1', '1', '0'},
			{'1', '1', '0', '1', '0'},
			{'1', '1', '0', '0', '0'},
			{'0', '0', '0', '0', '0'}
		};
		int res = solution.numIslands(grid);
		Assertions.assertEquals(1, res);
	}

	@Test
	public void test2() {
		char[][] grid = {
			{'1','1','0','0','0'},
			{'1','1','0','0','0'},
			{'0','0','1','0','0'},
			{'0','0','0','1','1'}
		};
		int res = solution.numIslands(grid);
		Assertions.assertEquals(3, res);
	}

	@Test
	public void test21() {
		char[][] grid = {
			{'1', '1', '1', '1', '0'},
			{'1', '1', '0', '1', '0'},
			{'1', '1', '0', '0', '0'},
			{'0', '0', '0', '0', '0'}
		};
		int res = solution.numIslands2(grid);
		Assertions.assertEquals(1, res);
	}

	@Test
	public void test22() {
		char[][] grid = {
			{'1','1','0','0','0'},
			{'1','1','0','0','0'},
			{'0','0','1','0','0'},
			{'0','0','0','1','1'}
		};
		int res = solution.numIslands2(grid);
		Assertions.assertEquals(3, res);
	}
}