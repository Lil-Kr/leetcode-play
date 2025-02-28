package com.cy.leetcodeplay.array.no392;

import com.cy.leetcodeplay.array.no392.Solution;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {


	private Solution solution = new Solution();


	@Test
	public void test1() {
		String s = "abc", t = "ahbgdc";
		boolean res1 = solution.isSubsequence(s, t);
		Assertions.assertEquals(true, res1);
	}

	@Test
	public void test2() {
		String s = "axc", t = "ahbgdc";
		boolean res1 = solution.isSubsequence(s, t);
		Assertions.assertEquals(false, res1);
	}

}