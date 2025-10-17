package com.cy.leetcodeplay.dp2.noself.no1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

	private Solution solution = new Solution();

	@Test
	public void test1() {
		String str1 = "abdf", str2 = "dfxxabyzabfzz";
		int res = solution.delete(str1, str2);
		Assertions.assertEquals(1, res);
	}

	@Test
	public void test2() {
		String str1 = "abdxdf", str2 = "dfxxabyzabfzz";
		int res = solution.delete(str1, str2);
		Assertions.assertEquals(3, res);
	}

	// ===================== dp =====================

	@Test
	public void test21() {
		String str1 = "abdf", str2 = "dfxxabyzabfzz";
		int res = solution.delete2(str1, str2);
		Assertions.assertEquals(1, res);
	}

	@Test
	public void test22() {
		String str1 = "abdxdf", str2 = "dfxxabyzabfzz";
		int res = solution.delete(str1, str2);
		Assertions.assertEquals(3, res);
	}
}