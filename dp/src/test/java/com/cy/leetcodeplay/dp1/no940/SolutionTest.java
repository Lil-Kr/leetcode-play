package com.cy.leetcodeplay.dp1.no940;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

	private Solution solution = new Solution();

	@Test
	public void test1() {
		String s = "abc";
		int res1 = solution.distinctSubseqII(s);
		Assertions.assertEquals(7, res1);
	}

	@Test
	public void test2() {
		String s = "aba";
		int res1 = solution.distinctSubseqII(s);
		Assertions.assertEquals(6, res1);
	}

	@Test
	public void test3() {
		String s = "aaa";
		int res1 = solution.distinctSubseqII(s);
		Assertions.assertEquals(3, res1);
	}
}