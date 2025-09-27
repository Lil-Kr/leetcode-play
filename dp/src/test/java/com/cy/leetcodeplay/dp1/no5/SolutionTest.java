package com.cy.leetcodeplay.dp1.no5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {
	private Solution solution = new Solution();

	@Test
	public void test1() {
		String s = "babad";
		String res = solution.longestPalindrome(s);
		Assertions.assertEquals("bab", res);
	}

	@Test
	public void test2() {
		String s = "cbbd";
		String res = solution.longestPalindrome(s);
		Assertions.assertEquals("bb", res);
	}

	@Test
	public void test3() {
		String s = "b";
		String res = solution.longestPalindrome(s);
		Assertions.assertEquals("b", res);
	}

	@Test
	public void test4() {
		String s = "bb";
		String res = solution.longestPalindrome(s);
		Assertions.assertEquals("bb", res);
	}

	@Test
	public void test5() {
		String s = "babad";
		String res = solution.longestPalindrome2(s);
		Assertions.assertEquals("bab", res);
	}

	@Test
	public void test6() {
		String s = "cbbd";
		String res = solution.longestPalindrome2(s);
		Assertions.assertEquals("bb", res);
	}
}