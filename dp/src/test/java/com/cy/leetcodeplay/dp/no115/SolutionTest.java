package com.cy.leetcodeplay.dp.no115;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

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
}