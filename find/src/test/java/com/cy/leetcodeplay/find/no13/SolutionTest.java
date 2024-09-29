package com.cy.leetcodeplay.find.no13;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

	private Solution solution = new Solution();

	@Test
	public void test1() {
		String s = "III";
		int res1 = solution.romanToInt(s);
		Assertions.assertEquals(3, res1);
	}

	@Test
	public void test2() {
		String s = "LVIII";
		int res1 = solution.romanToInt(s);
		Assertions.assertEquals(58, res1);
	}


	@Test
	public void test3() {
		String s = "MCMXCIV";
		int res1 = solution.romanToInt(s);
		Assertions.assertEquals(1994, res1);
	}
}