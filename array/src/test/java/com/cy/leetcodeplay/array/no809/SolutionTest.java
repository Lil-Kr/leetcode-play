package com.cy.leetcodeplay.array.no809;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

	private Solution solution = new Solution();

	@Test
	public void test_1() {
		String s = "heeellooo";
		String[] words = {"hello", "hi", "helo"};

		int res1 = solution.expressiveWords(s, words);
		Assertions.assertEquals(res1, 1);
	}

	@Test
	public void test_2() {
		String s = "heellooo";
		String[] words = {"hello", "hi", "helo"};

		int res1 = solution.expressiveWords(s, words);
		Assertions.assertEquals(res1, 0);
	}

	@Test
	public void test_3() {
		String s = "zzzzzyyyyy";
		String[] words = {"zzyy", "zy", "zyy"};

		int res1 = solution.expressiveWords(s, words);
		Assertions.assertEquals(res1, 3);
	}

}