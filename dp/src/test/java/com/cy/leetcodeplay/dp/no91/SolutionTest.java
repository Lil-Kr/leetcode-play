package com.cy.leetcodeplay.dp.no91;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

	private Solution solution = new Solution();

	@Test
	public void test1() {
		String s = "12";
		int res1 = solution.numDecodings(s);
		Assertions.assertEquals(2, res1);
	}
}