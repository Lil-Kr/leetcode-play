package com.cy.leetcodeplay.array.no696;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

	private Solution solution = new Solution();

	@Test
	public void test1() {
		String s = "00110011";
		int res1 = solution.countBinarySubstrings(s);
		Assertions.assertEquals(6, res1);
	}

	@Test
	public void test2() {
		char ch = 's';
		String.valueOf(ch);
	}
}