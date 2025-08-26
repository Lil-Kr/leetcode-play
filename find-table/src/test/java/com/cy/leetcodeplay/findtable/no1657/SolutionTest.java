package com.cy.leetcodeplay.findtable.no1657;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {
	private Solution solution = new Solution();

	@Test
	public void test1() {
		String word1 = "abc", word2 = "bca";

		boolean res = solution.closeStrings(word1, word2);
		Assertions.assertEquals(res, true);
	}

	@Test
	public void test2() {
		String word1 = "a", word2 = "aa";

		boolean res = solution.closeStrings(word1, word2);
		Assertions.assertEquals(res, false);
	}

	@Test
	public void test3() {
		String word1 = "cabbba", word2 = "abbccc";

		boolean res = solution.closeStrings(word1, word2);
		Assertions.assertEquals(res, true);
	}
}