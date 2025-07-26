package com.cy.leetcodeplay.array.no33;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

	private Solution solution = new Solution();

	@Test
	public void test1() {
		int[] arr = {4, 5, 6, 7, 0, 1};
		int target = 0;
		int res = solution.search(arr, target);
		Assertions.assertEquals(4, res);
	}

	@Test
	public void test2() {
		int[] arr = {4, 5, 6, 7, 0, 1};
		int target = 3;
		int res = solution.search(arr, target);
		Assertions.assertEquals(-1, res);
	}


	@Test
	public void test3() {
		int[] arr = {1};
		int target = 0;
		int res = solution.search(arr, target);
		Assertions.assertEquals(-1, res);
	}
}