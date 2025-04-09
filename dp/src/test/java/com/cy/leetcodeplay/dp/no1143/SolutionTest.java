package com.cy.leetcodeplay.dp.no1143;

import com.cy.leetcodeplay.dp.no1143.Solution;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {
	private Solution solution = new Solution();

	@Test
	public void test1() {
		String text1 = "abcde", text2 = "ace";
		int res1 = solution.longestCommonSubsequence(text1, text2);
		Assertions.assertEquals(3, res1);
	}

	@Test
	public void test2() {
		String text1 = "abcde", text2 = "ace";
		int res1 = solution.longestCommonSubsequence2(text1, text2);
		Assertions.assertEquals(3, res1);
	}

	@Test
	public void test3() {
		String text1 = "abcde", text2 = "ace";
		int res1 = solution.longestCommonSubsequence3(text1, text2);
		Assertions.assertEquals(3, res1);
	}

	@Test
	public void test4() {
		String text1 = "abcde", text2 = "ace";
		int res1 = solution.longestCommonSubsequence4(text1, text2);
		Assertions.assertEquals(3, res1);
	}

	@Test
	public void test5() {
		String text1 = "abcde", text2 = "ace";
		int res1 = solution.longestCommonSubsequence5(text1, text2);
		Assertions.assertEquals(3, res1);
	}
}