package com.cy.leetcodeplay.matrix.dp.no516;

import com.cy.leetcodeplay.dp.no516.Solution;
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
}