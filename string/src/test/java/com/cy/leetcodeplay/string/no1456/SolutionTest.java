package com.cy.leetcodeplay.string.no1456;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
	private Solution solution = new Solution();

	@Test
	public void test1() {
		String s = "abciiidef";
		int k = 3;
		int res = solution.maxVowels(s, k);
		Assertions.assertEquals(3, res);
	}

	@Test
	public void test2() {
		String s = "aeiou";
		int k = 2;
		int res = solution.maxVowels(s, k);
		Assertions.assertEquals(2, res);
	}

	@Test
	public void test3() {
		String s = "leetcode";
		int k = 3;
		int res = solution.maxVowels(s, k);
		Assertions.assertEquals(2, res);
	}

	@Test
	public void test4() {
		String s = "leeitcode";
		int k = 3;
		int res = solution.maxVowels(s, k);
		Assertions.assertEquals(3, res);
	}
}