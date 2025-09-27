package com.cy.leetcodeplay.dp1.no2111;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {
	private Solution solution = new Solution();

	@Test
	public void test1() {
		int[] arr = {5,4,3,2,1};
		int k = 1;
		int res = solution.kIncreasing(arr, k);
		Assertions.assertEquals(4, res);
	}

	@Test
	public void test2() {
		int[] arr = {4,1,5,2,6,2};
		int k = 2;
		int res = solution.kIncreasing(arr, k);
		Assertions.assertEquals(0, res);
	}

	@Test
	public void test3() {
		int[] arr = {4,1,5,2,6,2};
		int k = 3;
		int res = solution.kIncreasing(arr, k);
		Assertions.assertEquals(2, res);
	}
}