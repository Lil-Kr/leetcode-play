package com.cy.leetcodeplay.dpintervals.newcoder001;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
	private Solution solution = new Solution();

	@Test
	public void test1() {
		String s = "([[])";
		int res = solution.min(s);
		Assertions.assertEquals(1, res);
	}

	@Test
	public void test2() {
		String s = "([])[]";
		int res = solution.min(s);
		Assertions.assertEquals(0, res);
	}

	@Test
	public void test3() {
		String s = "[)";
		int res = solution.min(s);
		Assertions.assertEquals(2, res);
	}

	@Test
	public void test4() {
		String s = "[[(";
		int res = solution.min(s);
		Assertions.assertEquals(3, res);
	}
}