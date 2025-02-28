package com.cy.leetcodeplay.array.no696;

import com.cy.leetcodeplay.array.no696.Solution;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

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