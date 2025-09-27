package com.cy.leetcodeplay.dp1.no72;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {
	private Solution solution = new Solution();

	@Test
	public void test1() {
		String word1 = "horse", word2 = "ros";
		int res = solution.minDistance(word1, word2);
		Assertions.assertEquals(3, res);
	}

	@Test
	public void test2() {
		String word1 = "intention", word2 = "execution";
		int res = solution.minDistance(word1, word2);
		Assertions.assertEquals(5, res);
	}

	@Test
	public void test3() {
		String word1 = "horse", word2 = "ros";
		int res = solution.minDistance2(word1, word2);
		Assertions.assertEquals(3, res);
	}

	@Test
	public void test4() {
		String word1 = "intention", word2 = "execution";
		int res = solution.minDistance2(word1, word2);
		Assertions.assertEquals(5, res);
	}
}