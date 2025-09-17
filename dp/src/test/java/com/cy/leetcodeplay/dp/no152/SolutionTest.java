package com.cy.leetcodeplay.dp.no152;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
	private Solution s = new Solution();

	@Test
	public void test1() {
		int[] nums = {2, 3, -2, 4};
		int res = s.maxProduct(nums);
		Assertions.assertEquals(6, res);
	}

	@Test
	public void test2() {
		int[] nums = {-2,0,-1};
		int res = s.maxProduct(nums);
		Assertions.assertEquals(0, res);
	}

	@Test
	public void test3() {
		int[] nums = {2, -3, -2, 4};
		int res = s.maxProduct(nums);
		Assertions.assertEquals(48, res);
	}

	@Test
	public void test4() {
		int[] nums = {-2};
		int res = s.maxProduct(nums);
		Assertions.assertEquals(-2, res);
	}
}