package com.cy.leetcodeplay.stack.no84;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

	private Solution solution = new Solution();

	@Test
	public void test1() {
		int[] heights = {2, 1, 5, 6, 2, 3};
		int res1 = solution.largestRectangleArea(heights);
		System.out.println(res1);
		Assertions.assertEquals(10, res1);
	}

	@Test
	public void test2() {
		int[] heights = {5, 4, 1, 2};
		int res1 = solution.largestRectangleArea(heights);
		System.out.println(res1);
		Assertions.assertEquals(8, res1);
	}
}