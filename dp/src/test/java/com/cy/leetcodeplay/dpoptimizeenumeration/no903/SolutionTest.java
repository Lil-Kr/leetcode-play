package com.cy.leetcodeplay.dpoptimizeenumeration.no903;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {
	private Solution solution = new Solution();

	@Test
	public void test1() {
		String s = "DID";
		int res = solution.numPermsDISequence(s);
		Assertions.assertEquals(5, res);
	}

	@Test
	public void test2() {
		String s = "D";
		int res = solution.numPermsDISequence(s);
		Assertions.assertEquals(1, res);
	}

	// ================= dp ================

	@Test
	public void test21() {
		String s = "DID";
		int res = solution.numPermsDISequence2(s);
		Assertions.assertEquals(5, res);
	}

	@Test
	public void test22() {
		String s = "D";
		int res = solution.numPermsDISequence2(s);
		Assertions.assertEquals(1, res);
	}

	// ================= dp 优化枚举 ================

	@Test
	public void test31() {
		String s = "DID";
		int res = solution.numPermsDISequence3(s);
		Assertions.assertEquals(5, res);
	}

	@Test
	public void test32() {
		String s = "D";
		int res = solution.numPermsDISequence3(s);
		Assertions.assertEquals(1, res);
	}
}