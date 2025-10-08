package com.cy.leetcodeplay.array.no475;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {
	private Solution solution = new Solution();

	@Test
	public void test1() {
		int[] houses = {1,2,3}, heaters = {2};
		int res = solution.findRadius(houses, heaters);
		Assertions.assertEquals(1, res);
	}

	@Test
	public void test2() {
		int[] houses = {1,2,3,4}, heaters = {1,4};
		int res = solution.findRadius(houses, heaters);
		Assertions.assertEquals(1, res);
	}

	@Test
	public void test3() {
		int[] houses = {1,5}, heaters = {2};
		int res = solution.findRadius(houses, heaters);
		Assertions.assertEquals(3, res);
	}
}