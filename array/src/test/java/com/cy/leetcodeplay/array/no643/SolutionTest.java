package com.cy.leetcodeplay.array.no643;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

	private Solution solution = new Solution();

	@Test
	public void test1() {
		int[] nums = {1, 12, -5, -6, 50, 3};
		int k = 4;

		double res = solution.findMaxAverage(nums, k);
		Assertions.assertEquals(res, 12.75);
	}

	@Test
	public void test2() {
		int[] nums = {5};
		int k = 1;

		double res = solution.findMaxAverage(nums, k);
		Assertions.assertEquals(res, 5);
	}

	@Test
	public void test3() {
		int[] nums = {5, 3};
		int k = 1;

		double res = solution.findMaxAverage(nums, k);
		Assertions.assertEquals(res, 5);
	}

	@Test
	public void test4() {
		int[] nums = {0,1,1,3,3};
		int k = 4;

		double res = solution.findMaxAverage(nums, k);
		Assertions.assertEquals(res, 2);
	}
}