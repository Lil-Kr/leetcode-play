package com.cy.leetcodeplay.array.no153;

import com.cy.leetcodeplay.array.no153.Solution;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

	private Solution solution = new Solution();

	@Test
	public void test1() {
		int[] nums = {3, 4, 5, 1, 2};
		int res1 = solution.findMin(nums);
		Assertions.assertEquals(1, res1);
	}

	@Test
	public void test2() {
		int[] nums = {4, 5, 6, 7, 0, 1, 2};
		int res1 = solution.findMin(nums);
		Assertions.assertEquals(0, res1);
	}

	@Test
	public void test3() {
		int[] nums = {11, 13, 15, 17};
		int res1 = solution.findMin(nums);
		Assertions.assertEquals(11, res1);
	}

	@Test
	public void test4() {
		int[] nums = {1};
		int res1 = solution.findMin(nums);
		Assertions.assertEquals(1, res1);
	}

	@Test
	public void test5() {
		int[] nums = {3, 1, 2};
		int res1 = solution.findMin(nums);
		Assertions.assertEquals(1, res1);
	}
}