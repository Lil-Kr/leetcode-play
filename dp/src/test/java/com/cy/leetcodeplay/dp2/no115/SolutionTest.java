package com.cy.leetcodeplay.dp2.no115;

import com.cy.leetcodeplay.dp2.no115.Solution;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

	private Solution solution = new Solution();

	@Test
	public void test1() {
		String s = "rabbbit", t = "rabbit";
		int res = solution.numDistinct(s, t);
		Assertions.assertEquals(3, res);
	}

	@Test
	public void test2() {
		String s = "babgbag", t = "bag";
		int res = solution.numDistinct(s, t);
		Assertions.assertEquals(5, res);
	}

	@Test
	public void test3() {
		String s = "", t = "bag";
		int res = solution.numDistinct(s, t);
		Assertions.assertEquals(0, res);
	}

	@Test
	public void test4() {
		String s = "babgbag", t = "";
		int res = solution.numDistinct(s, t);
		Assertions.assertEquals(1, res);
	}

	@Test
	public void test5() {
		String s = "babgbag", t = "b";
		int res = solution.numDistinct(s, t);
		Assertions.assertEquals(3, res);
	}

	// =================== dp ==================

	@Test
	public void test21() {
		String s = "rabbbit", t = "rabbit";
		int res = solution.numDistinct2(s, t);
		Assertions.assertEquals(3, res);
	}

	@Test
	public void test22() {
		String s = "babgbag", t = "bag";
		int res = solution.numDistinct2(s, t);
		Assertions.assertEquals(5, res);
	}

	@Test
	public void test23() {
		String s = "", t = "bag";
		int res = solution.numDistinct2(s, t);
		Assertions.assertEquals(0, res);
	}

	@Test
	public void test24() {
		String s = "babgbag", t = "";
		int res = solution.numDistinct2(s, t);
		Assertions.assertEquals(1, res);
	}

	@Test
	public void test25() {
		String s = "babgbag", t = "b";
		int res = solution.numDistinct2(s, t);
		Assertions.assertEquals(3, res);
	}
}