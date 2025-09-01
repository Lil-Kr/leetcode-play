package com.cy.leetcodeplay.array.no1004;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

	private Solution solution = new Solution();

	@Test
	public void test1() {
		int[] nums = {1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0};
		int k = 2;

		int res = solution.longestOnes(nums, k);

		Assertions.assertEquals(6, res);
	}

	@Test
	public void test2() {
		int[] nums = {0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 0, 0, 0, 1, 1, 1, 1};
		int k = 3;

		int res = solution.longestOnes(nums, k);

		Assertions.assertEquals(10, res);
	}
}