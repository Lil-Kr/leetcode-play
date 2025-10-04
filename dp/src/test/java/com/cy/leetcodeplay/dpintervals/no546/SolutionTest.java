package com.cy.leetcodeplay.dpintervals.no546;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {
	private Solution solution = new Solution();

	@Test
	public void test1() {
		int[] boxes = {2, 2, 2, 2, 3, 4, 3, 1};
		int res = solution.removeBoxes(boxes);
		Assertions.assertEquals(22, res);
	}

	@Test
	public void test2() {
		int[] boxes = {1, 3, 2, 2, 2, 3, 4, 3, 1};
		int res = solution.removeBoxes(boxes);
		Assertions.assertEquals(23, res);
	}
}