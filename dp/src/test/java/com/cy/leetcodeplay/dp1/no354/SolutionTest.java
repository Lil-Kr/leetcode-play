package com.cy.leetcodeplay.dp1.no354;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {
	private Solution solution = new Solution();

	@Test
	public void test1() {
		int[][] envelopes = new int[][]{{5,4},{6,4},{6,7},{2,3}};
		int res = solution.maxEnvelopes(envelopes);
		Assertions.assertEquals(3, res);
	}

	@Test
	public void test2() {
		int[][] envelopes = new int[][]{{1,1},{1,1},{1,1}};
		int res = solution.maxEnvelopes(envelopes);
		Assertions.assertEquals(1, res);
	}

	@Test
	public void test3() {
		int[][] envelopes = new int[][]{{1,1},{1,1},{1,1}, {2,3}};
		int res = solution.maxEnvelopes(envelopes);
		Assertions.assertEquals(2, res);
	}
}