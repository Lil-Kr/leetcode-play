package com.cy.leetcodeplay.dp2.no516;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

	private Solution solution = new Solution();

	@Test
	public void test1() {
		String s = "bbbab";
		int res1 = solution.longestPalindromeSubSeq(s);
		Assertions.assertEquals(4, res1);
	}

	@Test
	public void test2() {
		String s = "bbbab";
		int res1 = solution.longestPalindromeSubSeq2(s);
		Assertions.assertEquals(4, res1);
	}

	@Test
	public void test3() {
		String s = "bbbab";
		int res1 = solution.longestPalindromeSubSeq3(s);
		Assertions.assertEquals(4, res1);
	}

	@Test
	public void test4() {
		String s = "rabeba";
		int res1 = solution.longestPalindromeSubSeq3(s);
		Assertions.assertEquals(5, res1);
	}

	@Test
	public void test5() {
		String s = "bbbab";
		int res1 = solution.longestPalindromeSubSeq4(s);
		Assertions.assertEquals(4, res1);
	}

	@Test
	public void test6() {
		String s = "rabeba";
		int res1 = solution.longestPalindromeSubSeq4(s);
		Assertions.assertEquals(5, res1);
	}
}