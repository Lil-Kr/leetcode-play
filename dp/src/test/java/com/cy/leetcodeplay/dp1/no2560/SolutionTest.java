package com.cy.leetcodeplay.dp1.no2560;

import org.junit.jupiter.api.Assertions;

class SolutionTest {

	private Solution solution = new Solution();

//	@Test
	public void test1() {
		int[] nums = {2, 3, 5, 9};
		int k = 2;
		int res = solution.minCapability(nums, k);
		Assertions.assertEquals(5, res);
	}

//	@Test
	public void test2() {
		int[] nums = {2,7,9,3,1};
		int k = 2;
		int res = solution.minCapability(nums, k);
		Assertions.assertEquals(2, res);
	}
}