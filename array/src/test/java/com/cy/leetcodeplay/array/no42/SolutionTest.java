package com.cy.leetcodeplay.array.no42;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

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

	@Test
	public void test3() {
		int[] height = {4,2};
		int res1 = solution.trap(height);
		Assertions.assertEquals(0, res1);
	}

	@Test
	public void test4() {
		int[] height = {4,2,8};
		int res1 = solution.trap(height);
		Assertions.assertEquals(2, res1);
	}
}