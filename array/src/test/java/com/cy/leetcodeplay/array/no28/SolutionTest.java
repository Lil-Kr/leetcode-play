package com.cy.leetcodeplay.array.no28;

import com.cy.leetcodeplay.array.no28.Solution;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

	private Solution solution = new Solution();

	@Test
	public void test_1() {
		String aystack = "sadbutsad", needle = "sad";
		int res1 = solution.strStr(aystack, needle);
		Assertions.assertEquals(0, res1);
	}

	@Test
	public void test_2() {
		String aystack = "leetcode", needle = "leeto";
		int res1 = solution.strStr(aystack, needle);
		Assertions.assertEquals(-1, res1);
	}

	@Test
	public void test_3() {
		String aystack = "mississippi", needle = "issip";
		int res1 = solution.strStr(aystack, needle);
		Assertions.assertEquals(4, res1);
	}
}