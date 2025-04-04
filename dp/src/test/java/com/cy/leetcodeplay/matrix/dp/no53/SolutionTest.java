package com.cy.leetcodeplay.matrix.dp.no53;

import com.cy.leetcodeplay.dp.no53.Solution;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

	private Solution solution = new Solution();

	@Test
	public void test1() {
		int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
		int res1 = solution.maxSubArray(nums);
		Assertions.assertEquals(6, res1);
	}

	@Test
	public void test2() {
		int[] nums = {5, 4, -1, 7, 8};
		int res1 = solution.maxSubArray(nums);
		Assertions.assertEquals(23, res1);
	}
}