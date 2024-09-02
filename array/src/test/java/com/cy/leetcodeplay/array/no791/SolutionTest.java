package com.cy.leetcodeplay.array.no791;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

	private Solution solution = new Solution();

	@Test
	public void test_1 () {
		String order = "cba", s = "abcd";
		String res1 = solution.customSortString(order, s);
		Assertions.assertEquals("cbad", res1);
	}

	@Test
	public void test_2 () {
		String order = "kqep", s = "pekaeq";
		String res1 = solution.customSortString(order, s);
		Assertions.assertEquals("kqeepa", res1);
	}

	@Test
	public void test_3 () {
		String order = "bcafg", s = "abcd";
		String res1 = solution.customSortString(order, s);
		Assertions.assertEquals("bcad", res1);
	}
}