package com.cy.leetcodeplay.dp.no918;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
	private Solution solution = new Solution();

	@Test
	public void test1() {
		int[] nums = {1, -2, 3, -2};
		int res = solution.maxSubarraySumCircular(nums);
		Assertions.assertEquals(3, res);
	}

	@Test
	public void test2() {
		int[] nums = {5,-3,5};
		int res = solution.maxSubarraySumCircular(nums);
		Assertions.assertEquals(10, res);
	}

	@Test
	public void test3() {
		int[] nums = {-3,-2,-3};
		int res = solution.maxSubarraySumCircular(nums);
		Assertions.assertEquals(-2, res);
	}
}