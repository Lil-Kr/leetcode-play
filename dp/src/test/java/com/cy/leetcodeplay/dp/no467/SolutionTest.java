package com.cy.leetcodeplay.dp.no467;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

	private Solution solution = new Solution();

	@Test
	public void tes1() {
		String s = "";
		int res1 = solution.findSubstringInWraproundString(s);
		Assertions.assertEquals(3, res1);
	}

}