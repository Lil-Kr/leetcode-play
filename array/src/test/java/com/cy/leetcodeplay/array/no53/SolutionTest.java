package com.cy.leetcodeplay.array.no53;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

	private Solution solution = new Solution();

	@Test
	public void test1() {
		int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
		int res1 = solution.maxSubArray(nums);
		Assertions.assertEquals(6, res1);
	}

	@Test
	public void test2() {
		int[] nums = {1};
		int res1 = solution.maxSubArray(nums);
		Assertions.assertEquals(1, res1);
	}

	@Test
	public void test3() {
		int[] nums = {5, 4, -1, 7, 8};
		int res1 = solution.maxSubArray(nums);
		Assertions.assertEquals(23, res1);
	}
}