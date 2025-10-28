package com.cy.leetcodeplay.dp01package.no494;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

	private Solution solution = new Solution();

	@Test
	public void test1() {
		int[] nums = {1, 1, 1, 1, 1};
		int target = 3;
		int res = solution.findTargetSumWays(nums, target);
		Assertions.assertEquals(5, res);
	}

	@Test
	public void test2() {
		int[] nums = {3, 1, 1, 2};
		int target = 1;
		int res = solution.findTargetSumWays(nums, target);
		Assertions.assertEquals(3, res);
	}

	@Test
	public void test3() {
		int[] nums = {1};
		int target = 1;
		int res = solution.findTargetSumWays(nums, target);
		Assertions.assertEquals(1, res);
	}

	// ============== dp ==============
	@Test
	public void test21() {
		int[] nums = {1, 1, 1, 1, 1};
		int target = 3;
		int res = solution.findTargetSumWays2(nums, target);
		Assertions.assertEquals(5, res);
	}

	@Test
	public void test22() {
		int[] nums = {3, 1, 1, 2};
		int target = 1;
		int res = solution.findTargetSumWays2(nums, target);
		Assertions.assertEquals(3, res);
	}

	@Test
	public void test23() {
		int[] nums = {1};
		int target = 1;
		int res = solution.findTargetSumWays2(nums, target);
		Assertions.assertEquals(1, res);
	}

	// =================== dp ===================
	@Test
	public void test31() {
		int[] nums = {1, 1, 1, 1, 1};
		int target = 3;
		int res = solution.findTargetSumWays3(nums, target);
		Assertions.assertEquals(5, res);
	}

	@Test
	public void test32() {
		int[] nums = {3, 1, 1, 2};
		int target = 1;
		int res = solution.findTargetSumWays3(nums, target);
		Assertions.assertEquals(3, res);
	}

	@Test
	public void test33() {
		int[] nums = {1};
		int target = 1;
		int res = solution.findTargetSumWays3(nums, target);
		Assertions.assertEquals(1, res);
	}

	@Test
	public void test41() {
		int[] nums = {1, 1, 1, 1, 1};
		int target = 3;
		int res = solution.findTargetSumWays4(nums, target);
		Assertions.assertEquals(5, res);
	}

	@Test
	public void test42() {
		int[] nums = {3, 1, 1, 2};
		int target = 1;
		int res = solution.findTargetSumWays4(nums, target);
		Assertions.assertEquals(3, res);
	}

	@Test
	public void test43() {
		int[] nums = {1};
		int target = 1;
		int res = solution.findTargetSumWays4(nums, target);
		Assertions.assertEquals(1, res);
	}
}