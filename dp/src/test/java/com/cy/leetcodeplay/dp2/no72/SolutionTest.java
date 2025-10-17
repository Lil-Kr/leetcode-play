package com.cy.leetcodeplay.dp2.no72;

import com.cy.leetcodeplay.dp2.no72.Solution;
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

	// =================== dp ===================

	@Test
	public void test21() {
		String word1 = "horse", word2 = "ros";
		int res = solution.minDistance2(word1, word2);
		Assertions.assertEquals(3, res);
	}

	@Test
	public void test22() {
		String word1 = "intention", word2 = "execution";
		int res = solution.minDistance2(word1, word2);
		Assertions.assertEquals(5, res);
	}

	@Test
	public void test33() {
		String word1 = "horse", word2 = "ros";
		int res = solution.minDistance3(word1, word2);
		Assertions.assertEquals(3, res);
	}

	@Test
	public void test34() {
		String word1 = "intention", word2 = "execution";
		int res = solution.minDistance3(word1, word2);
		Assertions.assertEquals(5, res);
	}
}