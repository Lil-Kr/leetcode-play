package com.cy.leetcodeplay.dpintervals.no08_14;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
	private Solution solution = new Solution();

	@Test
	public void test1() {
		String s = "1^0|0|1";
		int result = 0;
		int res = solution.countEval(s, result);
		Assertions.assertEquals(2, res);
	}

	@Test
	public void test2() {
		String s = "0&0&0&1^1|0";
		int result = 1;
		int res = solution.countEval(s, result);
		Assertions.assertEquals(10, res);
	}
}