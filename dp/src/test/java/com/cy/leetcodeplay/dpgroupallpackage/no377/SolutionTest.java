package com.cy.leetcodeplay.dpgroupallpackage.no377;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {
	private Solution solution = new Solution();

	@Test
	public void test1() {
		int[] nums = {1,2,3};
		int target = 4;
		int res = solution.combinationSum4(nums, target);
		Assertions.assertEquals(7, res);
	}

	@Test
	public void test2() {
		int[] nums = {9};
		int target = 3;
		int res = solution.combinationSum4(nums, target);
		Assertions.assertEquals(0, res);
	}

	@Test
	public void test3() {
		int[] nums = {1,2,3};
		int target = 4;
		int res = solution.combinationSum4_2(nums, target);
		Assertions.assertEquals(7, res);
	}

	@Test
	public void test4() {
		int[] nums = {9};
		int target = 3;
		int res = solution.combinationSum4_2(nums, target);
		Assertions.assertEquals(0, res);
	}
}