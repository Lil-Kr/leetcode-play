package com.cy.leetcodeplay.greedy.no55;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

	private Solution solution = new Solution();

	@Test
	public void test1() {
		int[] nums = {2, 3, 1, 1, 4};
		boolean res = solution.canJump(nums);

		Assertions.assertEquals(true, res);
	}

	@Test
	public void test2() {
		int[] nums = {3, 2, 1, 0, 4};
		boolean res = solution.canJump(nums);
		Assertions.assertEquals(false, res);
	}

	@Test
	public void test3() {
		int[] nums = {1};
		boolean res = solution.canJump(nums);
		Assertions.assertEquals(true, res);
	}

	@Test
	public void test4() {
		int[] nums = {0};
		boolean res = solution.canJump(nums);
		Assertions.assertEquals(true, res);
	}
}