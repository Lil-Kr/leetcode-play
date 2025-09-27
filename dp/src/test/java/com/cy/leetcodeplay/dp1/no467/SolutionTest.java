package com.cy.leetcodeplay.dp1.no467;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

	private Solution solution = new Solution();

	@Test
	public void tes1() {
		String s = "a";
		int res1 = solution.findSubstringInWraproundString(s);
		Assertions.assertEquals(1, res1);
	}

	@Test
	public void tes2() {
		String s = "cac";
		int res1 = solution.findSubstringInWraproundString(s);
		Assertions.assertEquals(2, res1);
	}

	@Test
	public void tes3() {
		String s = "zabp";
		int res1 = solution.findSubstringInWraproundString(s);
		Assertions.assertEquals(7, res1);
	}

}