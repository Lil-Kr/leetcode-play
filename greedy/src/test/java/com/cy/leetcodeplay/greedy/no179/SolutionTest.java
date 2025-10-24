package com.cy.leetcodeplay.greedy.no179;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

	private Solution solution = new Solution();

	@Test
	public void test1() {
		int[] nums = {10,2};
		String res = solution.largestNumber(nums);
		Assertions.assertEquals("210", res);
	}

	@Test
	public void test2() {
		int[] nums = {3, 30, 34, 5, 9};
		String res = solution.largestNumber(nums);
		Assertions.assertEquals("9534330", res);
	}
}