package com.cy.leetcodeplay.array.no1679;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

	private Solution solution = new Solution();

	@Test
	public void test1() {
		int[] nums = {1, 2, 3, 4};
		int k = 5;
		int res = solution.maxOperations(nums, k);
		Assertions.assertEquals(2, res);
	}

	@Test
	public void test2() {
		int[] nums = {3, 1, 3, 4, 3};
		int k = 6;
		int res = solution.maxOperations(nums, k);
		Assertions.assertEquals(1, res);
	}
}