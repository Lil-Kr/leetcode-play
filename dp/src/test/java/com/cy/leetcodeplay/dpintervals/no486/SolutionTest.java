package com.cy.leetcodeplay.dpintervals.no486;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
	private Solution solution = new Solution();

	@Test
	public void test1() {
		int[] nums = {1, 5, 2};
		boolean res = solution.predictTheWinner(nums);
		Assertions.assertEquals(false, res);
	}

	@Test
	public void test2() {
		int[] nums = {1, 5, 233, 7};
		boolean res = solution.predictTheWinner(nums);
		Assertions.assertEquals(true, res);
	}

	// ================= dp ================
	@Test
	public void test21() {
		int[] nums = {1, 5, 2};
		boolean res = solution.predictTheWinner2(nums);
		Assertions.assertEquals(false, res);
	}

	@Test
	public void test22() {
		int[] nums = {1, 5, 233, 7};
		boolean res = solution.predictTheWinner2(nums);
		Assertions.assertEquals(true, res);
	}
}