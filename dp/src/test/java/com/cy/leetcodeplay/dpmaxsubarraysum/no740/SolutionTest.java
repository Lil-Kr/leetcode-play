package com.cy.leetcodeplay.dpmaxsubarraysum.no740;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
	private Solution solution = new Solution();

	@Test
	public void test1() {
		int[] nums = {3, 4, 2};
		int res = solution.deleteAndEarn(nums);
		Assertions.assertEquals(6, res);
	}

	@Test
	public void test2() {
		int[] nums = {2, 2, 3, 3, 3, 4};
		int res = solution.deleteAndEarn(nums);
		Assertions.assertEquals(9, res);
	}

	@Test
	public void test3() {
		int[] nums = {1, 1, 1, 2, 4, 5, 5, 5, 6};
		int res = solution.deleteAndEarn(nums);
		Assertions.assertEquals(18, res);
	}

	// ================ dp + space compression ================

	@Test
	public void test21() {
		int[] nums = {3, 4, 2};
		int res = solution.deleteAndEarn2(nums);
		Assertions.assertEquals(6, res);
	}

	@Test
	public void test22() {
		int[] nums = {2, 2, 3, 3, 3, 4};
		int res = solution.deleteAndEarn2(nums);
		Assertions.assertEquals(9, res);
	}

	@Test
	public void test23() {
		int[] nums = {1, 1, 1, 2, 4, 5, 5, 5, 6};
		int res = solution.deleteAndEarn2(nums);
		Assertions.assertEquals(18, res);
	}
}