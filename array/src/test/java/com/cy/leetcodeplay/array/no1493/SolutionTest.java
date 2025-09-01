package com.cy.leetcodeplay.array.no1493;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

	private Solution solution = new Solution();

	@Test
	public void test1() {
		int[] nums = {1, 1, 0, 1};
		int res = solution.longestSubarray(nums);
		Assertions.assertEquals(3, res);
	}

	@Test
	public void test2() {
		int[] nums = {0, 1, 1, 1, 0, 1, 1, 0, 1};
		int res = solution.longestSubarray(nums);
		Assertions.assertEquals(5, res);
	}

	@Test
	public void test3() {
		int[] nums = {1, 1, 1};
		int res = solution.longestSubarray(nums);
		Assertions.assertEquals(2, res);
	}
}