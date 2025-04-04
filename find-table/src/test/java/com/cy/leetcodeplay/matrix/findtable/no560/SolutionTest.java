package com.cy.leetcodeplay.matrix.findtable.no560;

import com.cy.leetcodeplay.findtable.no560.Solution;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {
	private Solution solution = new Solution();

	@Test
	public void test1() {
		int[] nums = {1, 1, 1};
		int k = 2;
		int res1 = solution.subarraySum(nums, k);
		Assertions.assertEquals(res1, 2);
	}

	@Test
	public void test2() {
		int[] nums = {1, 2, 3};
		int k = 3;
		int res1 = solution.subarraySum(nums, k);
		Assertions.assertEquals(res1, 2);
	}
}