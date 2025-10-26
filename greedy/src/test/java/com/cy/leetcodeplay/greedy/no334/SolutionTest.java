package com.cy.leetcodeplay.greedy.no334;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

	private Solution solution = new Solution();

	@Test
	public void test1() {
		int[] nums = {1, 2, 3, 4, 5};
		boolean res = solution.increasingTriplet(nums);
		Assertions.assertEquals(true, res);
	}

	@Test
	public void test2() {
		int[] nums = {5, 4, 3, 2, 1};
		boolean res = solution.increasingTriplet(nums);
		Assertions.assertEquals(false, res);
	}

	@Test
	public void test3() {
		int[] nums = {2, 1, 5, 0, 4, 6};
		boolean res = solution.increasingTriplet(nums);
		Assertions.assertEquals(true, res);
	}
}