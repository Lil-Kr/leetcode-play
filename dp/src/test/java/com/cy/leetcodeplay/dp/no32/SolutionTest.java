package com.cy.leetcodeplay.dp.no32;

import com.cy.leetcodeplay.dp.no32.Solution;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {
	private Solution solution = new Solution();

	@Test
	public void test1() {
		String s = "(()";
		int res1 = solution.longestValidParentheses(s);

		Assertions.assertEquals(2, res1);
	}

	@Test
	public void test2() {
		String s = ")()())";
		int res1 = solution.longestValidParentheses(s);

		Assertions.assertEquals(4, res1);
	}

	@Test
	public void test3() {
		String s = "(()())";
		int res1 = solution.longestValidParentheses(s);
		Assertions.assertEquals(6, res1);
	}

	@Test
	public void test4() {
		String s = "()()(()())";
		int res1 = solution.longestValidParentheses(s);
		Assertions.assertEquals(10, res1);
	}
}