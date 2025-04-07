package com.cy.leetcodeplay.greedy.no435;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

	private Solution solution = new Solution();

	@Test
	public void test1() {
		int[][] intervals = {{1,2},{2,3},{3,4},{1,3}};
		int res = solution.eraseOverlapIntervals(intervals);
		Assertions.assertEquals(1, res);
	}

	@Test
	public void test2() {
		int[][] intervals = {{1,2},{1,2},{1,2}};
		int res = solution.eraseOverlapIntervals(intervals);
		Assertions.assertEquals(2, res);
	}

	@Test
	public void test3() {
		int[][] intervals = {{1,2},{2,3}};
		int res = solution.eraseOverlapIntervals(intervals);
		Assertions.assertEquals(0, res);
	}
}