package com.cy.leetcodeplay.dpmaxsubarraysum.no2560;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

	private Solution solution = new Solution();

	@Test
	public void test1() {
		int[] nums = {2, 3, 5, 9};
		int k = 2;
		int res = solution.minCapability(nums, k);
		Assertions.assertEquals(5, res);
	}

	@Test
	public void test2() {
		int[] nums = {2,7,9,3,1};
		int k = 2;
		int res = solution.minCapability(nums, k);
		Assertions.assertEquals(2, res);
	}

	// ============== dp space compression ===============

	@Test
	public void test21() {
		int[] nums = {2, 3, 5, 9};
		int k = 2;
		int res = solution.minCapability2(nums, k);
		Assertions.assertEquals(5, res);
	}

	@Test
	public void test22() {
		int[] nums = {2,7,9,3,1};
		int k = 2;
		int res = solution.minCapability2(nums, k);
		Assertions.assertEquals(2, res);
	}

	// ============== greedy ===============

	@Test
	public void test31() {
		int[] nums = {2, 3, 5, 9};
		int k = 2;
		int res = solution.minCapability3(nums, k);
		Assertions.assertEquals(5, res);
	}

	@Test
	public void test32() {
		int[] nums = {2,7,9,3,1};
		int k = 2;
		int res = solution.minCapability3(nums, k);
		Assertions.assertEquals(2, res);
	}
}