package com.cy.leetcodeplay.array.no42;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

	private Solution solution = new Solution();

	@Test
	public void test1() {
		int[] height = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
		int res1 = solution.trap(height);
		Assertions.assertEquals(6, res1);
	}

	@Test
	public void test2() {
		int[] height = {4, 2, 0, 3, 2, 5};
		int res1 = solution.trap(height);
		Assertions.assertEquals(9, res1);
	}
}