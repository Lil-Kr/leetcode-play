package com.cy.leetcodeplay.matrix.questionnumber.no80;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

	private Solution solution = new Solution();

	@Test
	public void test_1() {
		int[] nums = {0, 0, 1, 1, 1, 1, 2, 3, 3};

		int i = solution.removeDuplicates(nums);
		Assertions.assertEquals(7, i);
	}

	@Test
	public void test_2() {
		int[] nums = {0, 0, 1, 1, 1, 1, 2};

		int i = solution.removeDuplicates(nums);
		Assertions.assertEquals(5, i);
	}

	@Test
	public void test_3() {
		int[] nums = {0, 0, 1};
		int i = solution.removeDuplicates(nums);
		Assertions.assertEquals(3, i);
	}

	@Test
	public void test_4() {
		int[] nums = {0, 0, 1, 3};
		int i = solution.removeDuplicates(nums);
		Assertions.assertEquals(4, i);
	}
}