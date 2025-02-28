package com.cy.leetcodeplay.array.no35;

import com.cy.leetcodeplay.array.no35.Solution;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

	private Solution solution = new Solution();

	@Test
	public void test1() {
		int[] nums = {1, 3, 5, 6};
		int target = 5;
		int res1 = solution.searchInsert(nums, target);
		Assertions.assertEquals(2, res1);
	}

	@Test
	public void test2() {
		int[] nums = {1, 3, 5, 6};
		int target = 2;
		int res1 = solution.searchInsert(nums, target);
		Assertions.assertEquals(1, res1);
	}


	@Test
	public void test3() {
		int[] nums = {1, 3, 5, 6};
		int target = 7;
		int res1 = solution.searchInsert(nums, target);
		Assertions.assertEquals(4, res1);
	}
}