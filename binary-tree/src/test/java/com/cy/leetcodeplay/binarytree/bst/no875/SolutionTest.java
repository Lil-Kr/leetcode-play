package com.cy.leetcodeplay.binarytree.bst.no875;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

	private Solution solution = new Solution();

	@Test
	public void test1() {
		int[] piles = {3,6,7,11};
		int h = 8;
		int res = solution.minEatingSpeed(piles, h);
		Assertions.assertEquals(4, res);
	}

	@Test
	public void test2() {
		int[] piles = {30, 11, 23, 4, 20};
		int h = 5;
		int res = solution.minEatingSpeed(piles, h);
		Assertions.assertEquals(30, res);
	}

	@Test
	public void test3() {
		int[] piles = {30, 11, 23, 4, 20};
		int h = 6;
		int res = solution.minEatingSpeed(piles, h);
		Assertions.assertEquals(23, res);
	}

	@Test
	public void test4() {
		int[] piles = {805306368, 805306368, 805306368};
		int h = 1000000000;
		int res = solution.minEatingSpeed(piles, h);
		Assertions.assertEquals(3, res);
	}
}