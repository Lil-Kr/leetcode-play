package com.cy.leetcodeplay.dpmaxsubarraysum.no198;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

	private Solution solution = new Solution();

	@Test
	public void test1() {
		int[] nums = {1, 2, 3, 1};
		int res1 = solution.rob2(nums);
		Assertions.assertEquals(4, res1);
	}

	@Test
	public void test2() {
		int[] nums = {2,7,9,3,1};
		int res1 = solution.rob2(nums);
		Assertions.assertEquals(12, res1);
	}

	@Test
	public void test3() {
		int[] nums = {1, 2, 3, 1};
		int res1 = solution.rob3(nums);
		Assertions.assertEquals(4, res1);
	}

	@Test
	public void test4() {
		int[] nums = {2,7,9,3,1};
		int res1 = solution.rob3(nums);
		Assertions.assertEquals(12, res1);
	}
}