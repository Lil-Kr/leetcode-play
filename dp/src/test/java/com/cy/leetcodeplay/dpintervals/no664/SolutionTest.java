package com.cy.leetcodeplay.dpintervals.no664;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {
	private Solution solution = new Solution();

	@Test
	public void test1() {
		String s = "abcabc";
		int res = solution.strangePrinter(s);
		Assertions.assertEquals(5, res);
	}

	@Test
	public void test2() {
		String s = "aaabbb";
		int res = solution.strangePrinter(s);
		Assertions.assertEquals(2, res);
	}

	@Test
	public void test3() {
		String s = "aba";
		int res = solution.strangePrinter(s);
		Assertions.assertEquals(2, res);
	}

	// ================= dp ================
	@Test
	public void test21() {
		String s = "abcabc";
		int res = solution.strangePrinter2(s);
		Assertions.assertEquals(5, res);
	}

	@Test
	public void test22() {
		String s = "aaabbb";
		int res = solution.strangePrinter2(s);
		Assertions.assertEquals(2, res);
	}

	@Test
	public void test23() {
		String s = "aba";
		int res = solution.strangePrinter2(s);
		Assertions.assertEquals(2, res);
	}
}