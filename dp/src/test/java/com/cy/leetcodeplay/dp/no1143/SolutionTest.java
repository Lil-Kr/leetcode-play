package com.cy.leetcodeplay.dp.no1143;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
	private Solution solution = new Solution();

	@Test
	public void test1() {
		String text1 = "abcde", text2 = "ace";
		int res1 = solution.longestCommonSubsequence(text1, text2);
		Assertions.assertEquals(3, res1);
	}
}