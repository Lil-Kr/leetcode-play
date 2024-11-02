package com.cy.leetcodeplay.findtable.no219;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {
	private Solution solution = new Solution();

	@Test
	public void test1() {
		int[] nums = {1,2,3,1};
		int k = 3;
		boolean res1 = solution.containsNearbyDuplicate(nums, k);

		Assertions.assertEquals(true, res1);
	}

	@Test
	public void test2() {
		int[] nums = {1,0,1,1};
		int k = 1;
		boolean res1 = solution.containsNearbyDuplicate(nums, k);

		Assertions.assertEquals(true, res1);
	}

	@Test
	public void test3() {
		int[] nums = {1,2,3,1,2,3};
		int k = 2;
		boolean res1 = solution.containsNearbyDuplicate(nums, k);

		Assertions.assertEquals(false, res1);
	}
}