package com.cy.leetcodeplay.array.no14;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

	private Solution solution = new Solution();
	@Test
	public void test_1() {
		String[] strs = {"flower","flowabcddd","flight"};
		String res1 = solution.longestCommonPrefix(strs);
		Assertions.assertEquals("fl", res1);
	}

	@Test
	public void test_2() {
		String[] strs = {"dog","racecar","car"};
		String res1 = solution.longestCommonPrefix(strs);
		Assertions.assertEquals("", res1);
	}

	@Test
	public void test_3() {
		String[] strs = {"a"};
		String res1 = solution.longestCommonPrefix(strs);
		Assertions.assertEquals("a", res1);
	}
}