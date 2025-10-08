package com.cy.leetcodeplay.array.no41;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

	private Solution solution = new Solution();

	@Test
	public void test1() {
		int[] nums = {1, 2, 0};
		int res = solution.firstMissingPositive(nums);
		Assertions.assertEquals(res, 3);
	}

	@Test
	public void test2() {
		int[] nums = {3, 4, -1, 1};
		int res = solution.firstMissingPositive(nums);
		Assertions.assertEquals(res, 2);
	}

	@Test
	public void test3() {
		int[] nums = {7, 8, 9, 11, 12};
		int res = solution.firstMissingPositive(nums);
		Assertions.assertEquals(res, 1);
	}

	// =================== solution2 =====================

	@Test
	public void test21() {
		int[] nums = {1, 2, 0};
		int res = solution.firstMissingPositive2(nums);
		Assertions.assertEquals(res, 3);
	}

	@Test
	public void test22() {
		int[] nums = {3, 4, -1, 1};
		int res = solution.firstMissingPositive2(nums);
		Assertions.assertEquals(res, 2);
	}

	@Test
	public void test23() {
		int[] nums = {7, 8, 9, 11, 12};
		int res = solution.firstMissingPositive2(nums);
		Assertions.assertEquals(res, 1);
	}
}