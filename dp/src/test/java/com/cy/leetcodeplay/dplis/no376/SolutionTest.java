package com.cy.leetcodeplay.dplis.no376;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {
	private Solution solution = new Solution();

	@Test
	public void test1() {
		int[] nums = {1, 7, 4, 9, 2, 5};
		int res = solution.wiggleMaxLength(nums);
		Assertions.assertEquals(6, res);
	}

	@Test
	public void test2() {
		int[] nums = {0, 0};
		int res = solution.wiggleMaxLength(nums);
		Assertions.assertEquals(1, res);
	}

	@Test
	public void test21() {
		int[] nums = {1, 7, 4, 9, 2, 5};
		int res = solution.wiggleMaxLength2(nums);
		Assertions.assertEquals(6, res);
	}

	@Test
	public void test22() {
		int[] nums = {0, 0};
		int res = solution.wiggleMaxLength2(nums);
		Assertions.assertEquals(1, res);
	}
}