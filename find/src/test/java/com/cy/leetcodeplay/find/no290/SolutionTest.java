package com.cy.leetcodeplay.find.no290;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

	private Solution solution = new Solution();

	@Test
	public void test1() {
		String pattern = "abba", s = "dog cat cat dog";

		boolean res1 = solution.wordPattern(pattern, s);
		Assertions.assertEquals(true, res1);
	}

	@Test
	public void test2() {
		String pattern = "abba", s = "dog cat cat f";

		boolean res1 = solution.wordPattern(pattern, s);
		Assertions.assertEquals(false, res1);
	}

	@Test
	public void test3() {
		String pattern = "abbc", s = "dog cat cat f";
		boolean res1 = solution.wordPattern(pattern, s);
		Assertions.assertEquals(true, res1);


		pattern = "abbc";
		s = "dog cat cat cat";
		boolean res2 = solution.wordPattern(pattern, s);
		Assertions.assertEquals(false, res2);
	}
}