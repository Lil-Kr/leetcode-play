package com.cy.leetcodeplay.matrix.findtable.no16;


import com.cy.leetcodeplay.findtable.no16.Solution;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {
	private Solution solution = new Solution();

	@Test
	public void test1() {
		int[] nums = {-1, 2, 1, -4};
		int target = 1;
		int res1 = solution.threeSumClosest(nums, target);
		System.out.println(res1);
		Assertions.assertEquals(2, res1);
	}
}