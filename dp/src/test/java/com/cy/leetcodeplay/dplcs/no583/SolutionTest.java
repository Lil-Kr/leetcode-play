package com.cy.leetcodeplay.dplcs.no583;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {
	private Solution solution = new Solution();

	@Test
	public void test1() {
		String word1 = "sea", word2 = "eat";
		int res = solution.minDistance(word1, word2);
		Assertions.assertEquals(2, res);
	}

	@Test
	public void test2() {
		String word1 = "leetcode", word2 = "etco";
		int res = solution.minDistance(word1, word2);
		Assertions.assertEquals(4, res);
	}

	// =============== dp ==============
	@Test
	public void test21() {
		String word1 = "sea", word2 = "eat";
		int res = solution.minDistance2(word1, word2);
		Assertions.assertEquals(2, res);
	}

	@Test
	public void test22() {
		String word1 = "leetcode", word2 = "etco";
		int res = solution.minDistance2(word1, word2);
		Assertions.assertEquals(4, res);
	}
}