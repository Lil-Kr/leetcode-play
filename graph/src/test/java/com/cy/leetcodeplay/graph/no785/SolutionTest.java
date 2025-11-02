package com.cy.leetcodeplay.graph.no785;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

	private Solution solution = new Solution();

	@Test
	public void test1() {
		int[][] graph = {{1, 2, 3}, {0, 2}, {0, 1, 3}, {0, 2}};
		boolean res = solution.isBipartite(graph);
		Assertions.assertEquals(false, res);
	}

	@Test
	public void test2() {
		int[][] graph = {{1, 3}, {0, 2}, {1, 3}, {0, 2}};
		boolean res = solution.isBipartite(graph);
		Assertions.assertEquals(true, res);
	}
}