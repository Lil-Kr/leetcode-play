package com.cy.leetcodeplay.dplcs.no712;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {
	private Solution solution = new Solution();

	@Test
	public void test1() {
		String s1 = "sea", s2 = "eat";
		int res = solution.minimumDeleteSum(s1, s2);
		Assertions.assertEquals(231, res);
	}

	@Test
	public void test2() {
		String s1 = "delete", s2 = "leet";
		int res = solution.minimumDeleteSum(s1, s2);
		Assertions.assertEquals(403, res);
	}

	// =========== dp =============
	@Test
	public void test21() {
		String s1 = "sea", s2 = "eat";
		int res = solution.minimumDeleteSum2(s1, s2);
		Assertions.assertEquals(231, res);
	}

	@Test
	public void test22() {
		String s1 = "delete", s2 = "leet";
		int res = solution.minimumDeleteSum2(s1, s2);
		Assertions.assertEquals(403, res);
	}
}