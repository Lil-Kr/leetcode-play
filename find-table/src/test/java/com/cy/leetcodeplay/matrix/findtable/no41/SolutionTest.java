package com.cy.leetcodeplay.matrix.findtable.no41;

import com.cy.leetcodeplay.findtable.no41.Solution;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

	private Solution solution = new Solution();

	@Test
	public void test1() {
		int[] nums = {1, 2, 0};

		int res1 = solution.firstMissingPositive(nums);
		Assertions.assertEquals(3, res1);
	}

	@Test
	public void test2() {
		int[] nums = {3, 4, -1, 1};

		int res1 = solution.firstMissingPositive(nums);
		Assertions.assertEquals(2, res1);
	}

	@Test
	public void test3() {
		int[] nums = {7, 8, 9, 11, 12};
		int res1 = solution.firstMissingPositive(nums);
		Assertions.assertEquals(1, res1);
	}

	@Test
	public void test4() {
		int[] nums = {0};
		int res1 = solution.firstMissingPositive(nums);
		Assertions.assertEquals(1, res1);
	}
}