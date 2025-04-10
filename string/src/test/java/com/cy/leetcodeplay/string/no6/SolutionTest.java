package com.cy.leetcodeplay.string.no6;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

	private Solution solution = new Solution();

	@Test
	public void test1() {
		String s = "PAYPALISHIRING";
		int numRows = 3;
		String res = solution.convert(s, numRows);
		Assertions.assertEquals("PAHNAPLSIIGYIR", res);
	}

	@Test
	public void test2() {
		String s = "PAYPALISHIRING";
		int numRows = 4;
		String res = solution.convert(s, numRows);
		Assertions.assertEquals("PINALSIGYAHRPI", res);
	}

	@Test
	public void test3() {
		String s = "PAYPALISHIRING";
		int numRows = 1;
		String res = solution.convert(s, numRows);
		Assertions.assertEquals("PAYPALISHIRING", res);
	}
}