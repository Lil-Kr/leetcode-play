package com.cy.leetcodeplay.prefixsum.no724;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

	private Solution solution = new Solution();

	@Test
	public void test1() {
		int[] nums = {1, 7, 3, 6, 5, 6};
		int res = solution.pivotIndex(nums);
		Assertions.assertEquals(3, res);
	}

	@Test
	public void test2() {
		int[] nums = {1,2,3};
		int res = solution.pivotIndex(nums);
		Assertions.assertEquals(-1, res);
	}

	@Test
	public void test3() {
		int[] nums = {2,1,-1};
		int res = solution.pivotIndex(nums);
		Assertions.assertEquals(0, res);
	}
}