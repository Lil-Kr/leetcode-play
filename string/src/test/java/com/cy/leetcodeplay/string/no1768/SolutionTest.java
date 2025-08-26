package com.cy.leetcodeplay.string.no1768;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
	private Solution solution = new Solution();

	@Test
	public void test1() {
		String word1 = "abc", word2 = "pqr";
		String res = solution.mergeAlternately(word1, word2);
		Assertions.assertEquals("apbqcr", res);
	}

	@Test
	public void test2() {
		String word1 = "ab", word2 = "pqrs";
		String res = solution.mergeAlternately(word1, word2);
		Assertions.assertEquals("apbqrs", res);
	}

	@Test
	public void test3() {
		String word1 = "abcd", word2 = "pq";
		String res = solution.mergeAlternately(word1, word2);
		Assertions.assertEquals("apbqcd", res);
	}

	@Test
	public void test4() {
		String word1 = "a", word2 = "pq";
		String res = solution.mergeAlternately(word1, word2);
		Assertions.assertEquals("apq", res);
	}
}