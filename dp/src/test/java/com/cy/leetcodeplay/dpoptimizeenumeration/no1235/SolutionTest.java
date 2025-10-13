package com.cy.leetcodeplay.dpoptimizeenumeration.no1235;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

	private Solution solution = new Solution();

	@Test
	public void test1() {
		int[] startTime = {1, 2, 3, 3}, endTime = {3, 4, 5, 6}, profit = {50, 10, 40, 70};
		int res = solution.jobScheduling(startTime, endTime, profit);
		Assertions.assertEquals(120, res);
	}

	@Test
	public void test2() {
		int[] startTime = {1,2,3,4,6}, endTime = {3,5,10,6,9}, profit = {20,20,100,70,60};
		int res = solution.jobScheduling(startTime, endTime, profit);
		Assertions.assertEquals(150, res);
	}
}