package com.cy.leetcodeplay.string.no151;


import com.cy.leetcodeplay.string.no151.Solution;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

	private Solution solution = new Solution();

	@Test
	public void test1() {
		String s = "the sky is blue";
		String res1 = solution.reverseWords(s);
		Assertions.assertEquals("blue is sky the", res1);
	}

	@Test
	public void test2() {
		String s = "  hello world  ";
		String res1 = solution.reverseWords(s);
		Assertions.assertEquals("world hello", res1);
	}

	@Test
	public void test3() {
		String s = "t ";
		String res1 = solution.reverseWords(s);
		Assertions.assertEquals("t", res1);
	}
}