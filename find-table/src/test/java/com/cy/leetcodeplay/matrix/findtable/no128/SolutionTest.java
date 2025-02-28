package com.cy.leetcodeplay.matrix.findtable.no128;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

	private Solution solution = new Solution();

	@Test
	public void test1() {
		int[] nums = {100, 4, 200, 1, 3, 2};
		int res1 = solution.longestConsecutive(nums);
		System.out.println(res1);
		Assertions.assertEquals(4, res1);
	}
}