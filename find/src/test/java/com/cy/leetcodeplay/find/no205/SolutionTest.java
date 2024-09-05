package com.cy.leetcodeplay.find.no205;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

	private Solution solution = new Solution();

	@Test
	public void test1() {
		String s = "egg", t = "add";

		boolean res1 = solution.isIsomorphic(s, t);
		Assertions.assertEquals(true, res1);
	}

	@Test
	public void test2() {
		String s = "egge", t = "addd";

		boolean res1 = solution.isIsomorphic(s, t);
		Assertions.assertEquals(false, res1);
	}

	@Test
	public void test3() {
		String s = "paper", t = "title";

		boolean res1 = solution.isIsomorphic(s, t);
		Assertions.assertEquals(true, res1);
	}


}