package com.cy.leetcodeplay.greedy.no455;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

	private Solution solution = new Solution();

	@Test
	public void test1() {
		int[] g = {1,2,3}, s = {1,1};
		int res = solution.findContentChildren(g, s);
		Assertions.assertEquals(1, res);
	}

	@Test
	public void test2() {
		int[] g = {1,2}, s = {1,2,3};
		int res = solution.findContentChildren(g, s);
		Assertions.assertEquals(2, res);
	}
}