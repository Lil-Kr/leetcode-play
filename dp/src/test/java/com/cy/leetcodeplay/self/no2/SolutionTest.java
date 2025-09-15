package com.cy.leetcodeplay.self.no2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
	private Solution solution = new Solution();

	@Test
	public void test1() {
		String str1 = "abdf", str2 = "abxxdfyyadfzz";
		int res = solution.minDelete(str1, str2);
		Assertions.assertEquals(1, res);
	}

	@Test
	public void test2() {
		String str1 = "a", str2 = "abxxdfyyadfzz";
		int res = solution.minDelete(str1, str2);
		Assertions.assertEquals(0, res);
	}

	@Test
	public void test3() {
		String str1 = "abdf", str2 = "abxxdfyyaduzz";
		int res = solution.minDelete(str1, str2);
		Assertions.assertEquals(2, res);
	}
}