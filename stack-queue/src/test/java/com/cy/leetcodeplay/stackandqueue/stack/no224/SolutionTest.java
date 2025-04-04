package com.cy.leetcodeplay.stackandqueue.stack.no224;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

	private Solution solution = new Solution();

	@Test
	public void test1() {
		String s = "(1+(4+5+2)-3)+(6+8)";
		int res1 = solution.calculate(s);
		Assertions.assertEquals(23, res1);
	}

	@Test
	public void test2() {
		String s = " 2-1 + 2 ";
		int res1 = solution.calculate(s);
		Assertions.assertEquals(3, res1);
	}
}