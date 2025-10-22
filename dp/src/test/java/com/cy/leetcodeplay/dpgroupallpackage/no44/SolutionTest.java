package com.cy.leetcodeplay.dpgroupallpackage.no44;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {
	private Solution solution = new Solution();

	@Test
	public void test1() {
		String s = "aa", p = "a";
		boolean res = solution.isMatch(s, p);
		Assertions.assertEquals(false, res);
	}

	@Test
	public void test2() {
		String s = "aa", p = "*";
		boolean res = solution.isMatch(s, p);
		Assertions.assertEquals(true, res);
	}

	@Test
	public void test3() {
		String s = "cb", p = "?a";
		boolean res = solution.isMatch(s, p);
		Assertions.assertEquals(false, res);
	}

	// ========================= memory search ===================

	@Test
	public void test4() {
		String s = "aa", p = "a";
		boolean res = solution.isMatch2(s, p);
		Assertions.assertEquals(false, res);
	}

	@Test
	public void test5() {
		String s = "aa", p = "*";
		boolean res = solution.isMatch2(s, p);
		Assertions.assertEquals(true, res);
	}

	@Test
	public void test6() {
		String s = "cb", p = "?a";
		boolean res = solution.isMatch2(s, p);
		Assertions.assertEquals(false, res);
	}

	@Test
	public void test7() {
		String s = "adceb", p = "*a*b";
		boolean res = solution.isMatch2(s, p);
		Assertions.assertEquals(true, res);
	}

	// ========================= dp ===================

	@Test
	public void test8() {
		String s = "aa", p = "a";
		boolean res = solution.isMatch3(s, p);
		Assertions.assertEquals(false, res);
	}

	@Test
	public void test9() {
		String s = "aa", p = "*";
		boolean res = solution.isMatch3(s, p);
		Assertions.assertEquals(true, res);
	}

	@Test
	public void test10() {
		String s = "cb", p = "?a";
		boolean res = solution.isMatch3(s, p);
		Assertions.assertEquals(false, res);
	}

	@Test
	public void test11() {
		String s = "adceb", p = "*a*b";
		boolean res = solution.isMatch3(s, p);
		Assertions.assertEquals(true, res);
	}
}