package com.cy.leetcodeplay.dp.no646;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {
	private Solution solution = new Solution();

	@Test
	public void test1() {
		int[][] pairs = {{1,2},{2,3},{3,4}};
		int res = solution.findLongestChain(pairs);
		Assertions.assertEquals(2, res);
	}

	@Test
	public void test2() {
		int[][] pairs = {{1,2},{7,8},{4,5}};
		int res = solution.findLongestChain(pairs);
		Assertions.assertEquals(3, res);
	}

	@Test
	public void test3() {
		int[][] pairs = {{1,2},{2,3},{3,4}};
		int res = solution.findLongestChain2(pairs);
		Assertions.assertEquals(2, res);
	}

	@Test
	public void test4() {
		int[][] pairs = {{1,2},{7,8},{4,5}};
		int res = solution.findLongestChain2(pairs);
		Assertions.assertEquals(3, res);
	}
}