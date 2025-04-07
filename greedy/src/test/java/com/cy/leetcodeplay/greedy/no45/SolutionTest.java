package com.cy.leetcodeplay.greedy.no45;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {
	private Solution solution = new Solution();

	@Test
	public void test1() {
		int[] nums = {2, 3, 1, 1, 4};
		int res = solution.jump(nums);
		Assertions.assertEquals(2, res);
	}

	@Test
	public void test2() {
		int[] nums = {2, 3, 0, 1, 4};
		int res = solution.jump(nums);
		Assertions.assertEquals(2, res);
	}
}