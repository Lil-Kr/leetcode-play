package com.cy.leetcodeplay.dp01package.no416;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {
	private Solution solution = new Solution();

	@Test
	public void test1() {
		int[] nums = {1,5,11,5};
		boolean res = solution.canPartition2(nums);
		Assertions.assertEquals(true, res);
	}

	@Test
	public void test2() {
		int[] nums = {1,2,3,5};
		boolean res = solution.canPartition2(nums);
		Assertions.assertEquals(false, res);
	}

	@Test
	public void test3() {
		int[] nums = {1,5,11,5};
		boolean res = solution.canPartition3(nums);
		Assertions.assertEquals(true, res);
	}

	@Test
	public void test4() {
		int[] nums = {1,2,3,5};
		boolean res = solution.canPartition3(nums);
		Assertions.assertEquals(false, res);
	}
}