package com.cy.leetcodeplay.array.no268;

import com.cy.leetcodeplay.array.no268.Solution;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

	private Solution solution = new Solution();

	@Test
	public void test_1() {
		int[] arr1 = {9, 6, 4, 2, 3, 5, 7, 0, 1}; // [0 ... 9]
		int res = solution.missingNumber(arr1);
		Assertions.assertEquals(res, 8);
	}

	@Test
	public void test_2() {
		int[] arr1 = {0,1}; // [0 ... 2]
		int res = solution.missingNumber(arr1);
		Assertions.assertEquals(res, 2);
	}

	@Test
	public void test_3() {
		int[] arr1 = {3,0,1}; // [0 ... 3]
		int res = solution.missingNumber(arr1);
		Assertions.assertEquals(res, 2);
	}

}