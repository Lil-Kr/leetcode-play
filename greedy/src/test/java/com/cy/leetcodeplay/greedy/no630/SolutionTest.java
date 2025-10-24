package com.cy.leetcodeplay.greedy.no630;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

	private Solution solution = new Solution();

	@Test
	public void test1() {
		int[][] nums = {{2, 5}, {2, 19}, {1, 8}, {1, 3}};
		int res = solution.scheduleCourse(nums);
		Assertions.assertEquals(4, res);
	}

	@Test
	public void test2() {
		int[][] nums = {{100, 200}, {200, 1300}, {1000, 1250}, {2000, 3200}};
		int res = solution.scheduleCourse(nums);
		Assertions.assertEquals(3, res);
	}

	@Test
	public void test3() {
		int[][] nums = {{1, 2}};
		int res = solution.scheduleCourse(nums);
		Assertions.assertEquals(1, res);
	}

	@Test
	public void test4() {
		int[][] nums = {{3, 2}, {4, 3}};
		int res = solution.scheduleCourse(nums);
		Assertions.assertEquals(0, res);
	}
}