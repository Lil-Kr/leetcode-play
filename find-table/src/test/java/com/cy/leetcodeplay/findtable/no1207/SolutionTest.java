package com.cy.leetcodeplay.findtable.no1207;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
	private Solution solution = new Solution();

	@Test
	public void test1() {
		int[] arr = {1, 2, 2, 1, 1, 3};
		boolean res = solution.uniqueOccurrences(arr);
		Assertions.assertEquals(true, res);
	}

	@Test
	public void test2() {
		int[] arr = {1, 2};
		boolean res = solution.uniqueOccurrences(arr);
		Assertions.assertEquals(false, res);
	}

	@Test
	public void test3() {
		int[] arr = {-3, 0, 1, -3, 1, 1, 1, -3, 10, 0};
		boolean res = solution.uniqueOccurrences(arr);
		Assertions.assertEquals(true, res);
	}

	@Test
	public void test4() {
		int[] arr = {3,5,-2,-3,-6,-6};
		boolean res = solution.uniqueOccurrences(arr);
		Assertions.assertEquals(false, res);
	}
}