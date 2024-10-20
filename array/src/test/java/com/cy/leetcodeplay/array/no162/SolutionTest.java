package com.cy.leetcodeplay.array.no162;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

	private Solution solution = new Solution();

	@Test
	public void test1() {
		int[] nums = {1,2,3,1};

		int res1 = solution.findPeakElement(nums);
		Assertions.assertEquals(2, res1);
	}
}