package com.cy.leetcodeplay.prefixsum.no1732;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class SolutionTest {

	private Solution solution = new Solution();

	@Test
	public void test1() {
		int[] gain = {-5, 1, 5, 0, -7};
		int res = solution.largestAltitude(gain);
		Assertions.assertEquals(1, res);
	}

	@Test
	public void test2() {
		int[] gain = {-4, -3, -2, -1, 4, 3, 2};
		int res = solution.largestAltitude(gain);
		Assertions.assertEquals(0, res);
	}
}