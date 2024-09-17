package com.cy.leetcodeplay.stack.no20;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
class SolutionTest {

	private Solution solution = new Solution();

	@Test
	public void test1() {
		String s = "([])";
		boolean res1 = solution.isValid2(s);
		Assertions.assertEquals(true, res1);
	}

	@Test
	public void test2() {
		String s = "()[]{}";
		boolean res1 = solution.isValid2(s);
		Assertions.assertEquals(true, res1);
	}

	@Test
	public void test3() {
		String s = "(]";
		boolean res1 = solution.isValid2(s);
		Assertions.assertEquals(false, res1);
	}

	@Test
	public void test4() {
		String s = "]";
		boolean res1 = solution.isValid2(s);
		Assertions.assertEquals(false, res1);
	}

	@Test
	public void test5() {
		String s = "){";
		boolean res1 = solution.isValid2(s);
		Assertions.assertEquals(false, res1);
	}
}