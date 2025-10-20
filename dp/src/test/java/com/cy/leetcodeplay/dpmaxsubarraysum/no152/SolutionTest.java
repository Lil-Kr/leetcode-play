package com.cy.leetcodeplay.dpmaxsubarraysum.no152;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {
	private Solution solution = new Solution();

	@Test
	public void test1() {
		int[] nums = {2, 3, -2, 4};
		int res = solution.maxProduct(nums);
		Assertions.assertEquals(6, res);
	}

	@Test
	public void test2() {
		int[] nums = {-2,0,-1};
		int res = solution.maxProduct(nums);
		Assertions.assertEquals(0, res);
	}

	@Test
	public void test3() {
		int[] nums = {2, -3, -2, 4};
		int res = solution.maxProduct(nums);
		Assertions.assertEquals(48, res);
	}

	@Test
	public void test4() {
		int[] nums = {-2};
		int res = solution.maxProduct(nums);
		Assertions.assertEquals(-2, res);
	}

	// ================ dp =================

	@Test
	public void test21() {
		int[] nums = {2, 3, -2, 4};
		int res = solution.maxProduct2(nums);
		Assertions.assertEquals(6, res);
	}

	@Test
	public void test22() {
		int[] nums = {-2,0,-1};
		int res = solution.maxProduct2(nums);
		Assertions.assertEquals(0, res);
	}

	@Test
	public void test23() {
		int[] nums = {2, -3, -2, 4};
		int res = solution.maxProduct2(nums);
		Assertions.assertEquals(48, res);
	}

	@Test
	public void test24() {
		int[] nums = {-2};
		int res = solution.maxProduct2(nums);
		Assertions.assertEquals(-2, res);
	}
}