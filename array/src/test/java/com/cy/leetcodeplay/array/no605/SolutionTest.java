package com.cy.leetcodeplay.array.no605;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

	private Solution solution = new Solution();

	@Test
	public void test1() {
		int[] flowerbed = {1, 0, 0, 0, 1};
		int n = 1;

		boolean res = solution.canPlaceFlowers(flowerbed, n);
		Assertions.assertEquals(true, res);
	}

	@Test
	public void test2() {
		int[] flowerbed = {1, 0, 0, 0, 1};
		int n = 2;

		boolean res = solution.canPlaceFlowers(flowerbed, n);
		Assertions.assertEquals(false, res);
	}
}