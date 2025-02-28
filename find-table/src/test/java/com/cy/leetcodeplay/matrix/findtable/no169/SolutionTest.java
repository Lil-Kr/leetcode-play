package com.cy.leetcodeplay.matrix.findtable.no169;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

	private Solution solution = new Solution();

	@Test
	public void test1() {
		int[] nums = {3, 2, 3};
		int res1 = solution.majorityElement(nums);
		Assertions.assertEquals(3, res1);
	}

	@Test
	public void test2() {
		int[] nums = {2,2,1,1,1,2,2};
		int res1 = solution.majorityElement(nums);
		Assertions.assertEquals(2, res1);
	}

	@Test
	public void test3() {
		int[] nums = {3,2,3,4,4,4,4,4};
		int res1 = solution.majorityElement(nums);
		Assertions.assertEquals(4, res1);
	}
}